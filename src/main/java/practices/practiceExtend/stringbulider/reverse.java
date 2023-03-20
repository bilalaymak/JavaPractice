package practices.practiceExtend.stringbulider;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir String değer giriniz");
        String str2 = input.nextLine().replaceAll(" ","").toLowerCase();

        System.out.println("str2 = " + str2);

        StringBuilder stb = new StringBuilder(str2);
        System.out.println("stb = " + stb);
        String str2Reverse = stb.reverse().toString();
        System.out.println("Reverse() sonrası stb: "+stb);

        if(str2.equals(str2Reverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Palindrome DEĞİL");
        }
    }
}
