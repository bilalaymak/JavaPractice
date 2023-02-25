package practices02.inheritance.mammalsvariable;

public class Animal {
    public int weight =12;
    protected boolean feed = true;
    void method1(){
        System.out.println("animal method");
    }

    public static void main(String[] args) {
        Animal a = new Mammals();
        Animal b = new Dog();

        a.method1();
        System.out.println("a.weight = " + a.weight);
        System.out.println("a.feed = " + a.feed);

        System.out.println();

        Mammals aas1 = (Mammals) a; //we can down casting like that
        aas1.method2();
        aas1.method1();
        System.out.println(aas1.feed);
        System.out.println("aas1.bark = " + aas1.bark);//Mammal's bark is false
        System.out.println("aas1.weight = " + aas1.weight);//Mammal's weight is 13

        System.out.println();

        Mammals aas = (Mammals) b; ////we can down casting like that
        aas.method1();
        aas.method2();
        System.out.println("aas.weight = " + aas.weight);
        System.out.println("aas.bark = " + aas.bark);
        System.out.println("aas.feed = " + aas.feed);

    }

}

