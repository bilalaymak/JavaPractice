package oopractices.practice01methodcall;

public class Runner {
    public static void main(String[] args) {

        //method calling from parent class by creating an object

        Add addobj = new Add();
         addobj.add(12,34);

        Multiplication multiplyobj = new Multiplication();
        System.out.println("multiplyobj.multiply(12,45) = " + multiplyobj.multiply(12, 45));

        Division divisionobj = new Division();
        System.out.println("divisionobj.divide(35,5) = " + divisionobj.divide(35, 5));

        System.out.println("from parent class // multiplyobj.divide(12,3)  = " + multiplyobj.divide(12, 3));

        multiplyobj.add(45,78);//from parent class==> 123

        divisionobj.add(45,99);//from parent class ==> 144





    }





}
