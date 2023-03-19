package step02.inheritance.abcconstructor;

public class C extends B{
    public void method3(){
        System.out.println("3rd method");
    }
    public C(){
        System.out.println("7th constructor");
    }
    public C(int num3){
        super(true);
        System.out.println("8th constructor");
        System.out.println(num3);
    }









}
