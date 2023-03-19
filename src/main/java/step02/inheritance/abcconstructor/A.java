package step02.inheritance.abcconstructor;

public class A {
    public void method1(){
        System.out.println("first method");
    }
    public A(){
        System.out.println("first constructor ");
    }
    public A(String string1){
        System.out.println("second constructor = string1 = " + string1);
    }
    public A(int num1){
        this("from third constructor to second constructor ");
        System.out.println("third constructor = num1 " + num1);
    }
    public A(String string2, int num2){
        this(1000);//from fourth constructor to third constructor
        System.out.println("fourth constructor = string2 = " + string2 + "num2 = " + num2);
    }









}
