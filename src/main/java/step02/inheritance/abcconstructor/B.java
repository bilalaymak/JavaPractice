package step02.inheritance.abcconstructor;

public class B extends A{

    public void method2(){
        System.out.println("2nd method");
    }
    public B(){
        System.out.println("5th constructor");
    }
    public B(boolean num3){
        super("6th constructor goes to 2nd constructor");
        System.out.println("6th constructor");
        if (num3){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }







}
