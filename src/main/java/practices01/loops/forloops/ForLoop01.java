package practices01.loops.forloops;

public class ForLoop01 {
    public static void main(String[] args) {


        //Example 1: type code to reverse a String
        // for example: Top ==> moT  ==> very common interview question

        String name = "Mark";
        String reversedName = ""; // we created new container to save new data

        for (int i = name.length()-1 ; i >=0 ; i--) {
            // to reverse a String we should use name.length()-1 method
            char ch = name.charAt(i);// we create a container(ch) to simplify the code
           // System.out.print(ch);//kraM ==> 1. way to print the result
            reversedName = reversedName + ch;
        }
        System.out.println(reversedName);// we changed System.out.print(ch);//kraM
        // 2. way to print the result
        // and write a sout out of the for loop to take and print the reversedName output

        System.out.println("*********************");


        String name2 = "Bilal";
        String reversedName2 = "";
        for (int k = name2.length()-1; k >=0 ; k--) {

            char ch2 = name2.charAt(k);
            reversedName2 = reversedName2 + ch2;

        }
        System.out.println(reversedName2);

        //Example 2: find the sum of the integers from 3 to 6

        int sum = 0;

        for (int m = 3; m < 7 ; m++) {
            sum = sum + m;
        }
        System.out.println(sum);

        //example 3: find the multiplication of the integers from 3 to 6
        // interview question

        int multiplication = 1;
        for (int i = 3; i < 7 ; i++) {

            multiplication = multiplication * i;
        }
        System.out.println(multiplication);


        //example 4: type code to find the sum of the digits of an integer
        // 574 ==> 5+7+4=16

        int num = 574;
        num = Math.abs(num);
        int result = 0;

        for (int i = 0; i < 3; i++) {
            result = result + num%10;

            num = num/10;
        }
        System.out.println(result);

        //second way

         num = -584; // we used negative number
        num = Math.abs(num);
        result = 0;
        for (int i = 584; i >0 ; i=i/10) {
            result = result + i%10;
        }
        System.out.println(result);
    }
}





















