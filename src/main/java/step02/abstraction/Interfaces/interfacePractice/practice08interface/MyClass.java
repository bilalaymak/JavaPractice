package step02.abstraction.Interfaces.interfacePractice.practice08interface;

public class MyClass implements InfA{


    static int x = 5;


    @Override
    public int myMethod() {
        return x;
    }


    public static void main(String[] args) {


        System.out.println(y);//9
        System.out.println(x);//5
        System.out.println(InfA.x);//7
        System.out.println(InfB.x);//3

        InfA obj = new MyClass();
        System.out.println(obj.myMethod());//5
        System.out.println(InfA.x);//7

        MyClass mc = new MyClass();
        System.out.println(mc.y);//9
        System.out.println(mc.x);//5
        System.out.println(mc.myMethod());//5


    }






}
