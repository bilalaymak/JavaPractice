package practices.practiceExtend.practices.x3;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateChars {
    public static void main(String[] args) {

        //write a code that returns the duplicate chars in a string array(interview question)
// for each
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir kelime/cümle giriniz.");
        String str = sc.nextLine().replaceAll(" ", "");

        ArrayList<Character> list = new ArrayList<>();

        // for loop

        for (int i = 0; i < str.length(); i++) {           // char ch=str.charAt(0);

            if (list.contains(str.charAt(i))) {
                System.out.print("Tekrarlanan harfler: ");
                System.out.println(str.charAt(i));

            } else {
                list.add(str.charAt(i));
            }


            //for each
            for (char ch : str.toCharArray()) {
                if (list.contains(ch)) {
                    System.out.println(ch + " is a repeated character.");
                } else {
                    list.add(ch);
                    System.out.println("tekrarlanan harf yoktur");
                }


            }
        }
    }
}
