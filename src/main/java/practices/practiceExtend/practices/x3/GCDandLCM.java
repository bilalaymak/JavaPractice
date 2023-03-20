package practices.practiceExtend.practices.x3;

import java.math.BigInteger;
import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {

        //ask user to enter 2 integer then find GCD(the greatest common Divisor) and
        //LCM(the least common multiple)
        /*
        input: 30 and 40
        expected output: GCD ==> 10 LCM ==> 120

         */
        //1. step: ask user two integers
        Scanner input = new Scanner(System.in);
        System.out.println("please enter two integer numbers");
        int a = input.nextInt();
        int b = input.nextInt();

        //2. step: find GCD (the greatest common divisor)EBOB
        // we convert the integers to BigIntegers by using valueOf() method

        BigInteger bigIntA = BigInteger.valueOf(a);
        BigInteger bingIntB = BigInteger.valueOf(b);

        //we find the GCD of the two integers
        BigInteger gcd = bigIntA.gcd(bingIntB);
        System.out.println("gcd = " + gcd);//10

        BigInteger gcd1 = bingIntB.gcd(bigIntA);
        System.out.println("gcd1 = " + gcd1);//10

        //then we find the LCM(the least common multiple)EKOK
        //formula is ==> (a*b)/gcd(a,b) ==> a*b/EBOB(a,b)
        BigInteger lcm = bigIntA.multiply(bingIntB).divide(gcd);
        System.out.println("lcm = " + lcm);//lcm = 120




    }
}












