package practices.practiceExtend.practices;

import java.util.Scanner;

public class ArmstrongNumber01 {
    public static void main(String[] args) {



        // soru1: Check if the integer is  an Armstrong numbers
        // to 4-digit numbers(4 digit-> exclusive)
        // 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        // 370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

        // soru2: Birden baslayarak girilen sayıya kadar her bir
        // tamsayının amstrong sayı olup olmadıgını
        // gösteren program yazınız

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int num = input.nextInt();

        armstrong(num);
        armstrongtoEnteredNum(num);



    }

    private static void armstrong(int n){
        int sumOfSquare = 0;
        int numAtDigit = 0;

        int enteredNum = n;
        while (n>0) {
        numAtDigit = n%10;
        sumOfSquare += (numAtDigit*numAtDigit*numAtDigit);
        n = n/10;
        }
        if (enteredNum == sumOfSquare){
            System.out.println("the number of  "+enteredNum + " is amstrong number ");
        }else {
            System.out.println("the number of  "+enteredNum + " is ont amstrong number ");
        }

    }
    //second question
    private static void armstrongtoEnteredNum(int num){
        for(int i = 1; i<=num; i++){
            armstrong(i);//recursive method
        }
    }










}











