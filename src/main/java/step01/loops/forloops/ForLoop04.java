package step01.loops.forloops;

public class ForLoop04 {
    public static void main(String[] args) {

        //Example 1: Put * between 2 consecutive characters and to the end in a String.
        //           For example; "Java" ==> J*a*v*a*
        String s = "Java";
        for(int i=0;  i<s.length(); i++){
            System.out.print(s.charAt(i) + "*");
        }

        System.out.println();

        //Example 2: Type code to print unique characters in a String.
        //           Hello ==> Heo
        String t = "Hello";

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(t.indexOf(ch) == t.lastIndexOf(ch)){
                System.out.print(ch);
            }
        }

        System.out.println();

        //Example 3: Type code to print a String in reverse.
        //           For example; "Ali Can" ==> "naC ilA"
        String u = "Java";
        for(int i=u.length()-1; i>=0; i--){
            char ch = u.charAt(i);
            System.out.print(ch);
        }

        System.out.println();

        //Example 4: Type code to find the sum of the integers from 3 to 7
        int sum = 0;

        for(int i=3; i<8; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
