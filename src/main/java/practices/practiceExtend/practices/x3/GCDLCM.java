package practices.practiceExtend.practices.x3;

import java.util.Scanner;

public class GCDLCM {
    public static void main(String[] args) {
        //ask user to enter 2 integer then find GCD(the greatest common Divisor) and
        //LCM(the least common multiple)
        /*
        input: 30 and 40
        expected output: GCD ==> 10 LCM ==> 120

         //LCM formula is ==> (a*b)/gcd(a,b) ==> a*b/EBOB(a,b)

         //1. step: ask user two integers

        //2. step: find GCD (the greatest common divisor)EBOB
        //we find the LCM(the least common multiple)EKOK
         */


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen ıkı ınteger sayı gırnız");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        int ebobalma = ebob(sayi1,sayi2);
       // System.out.println("ebob = " + ebobalma);
        System.out.println("ekok = " + (sayi1*sayi2)/ebobalma);
    }
    public static int ebob(int a, int b){
        while (b !=0){
            int temp = b;
            b = a%b;
            a = temp;
            System.out.println("ebob için degerler = " +a);
        }
        return Math.abs(a);
    }

}
