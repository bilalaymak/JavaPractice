package practices02.inheritance.mammalsvariable;

public class Dog extends Mammals{


    private boolean bark = true;
    void method3(){
        System.out.println("dog method");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();//we create the object from Dog class, our references is related to Dog class
        System.out.println(dog.bark);//true
        System.out.println(dog.feed);//true
        System.out.println(dog.weight);//13
        dog.method1();
        dog.method2();
        dog.method3();


        Animal d = new Mammals();
        System.out.println("d.feed = " + d.feed);
        System.out.println("d.weight = " + d.weight);
        d.method1();

        Animal a = new Animal();

        Mammals a1 = (Mammals) a;
        System.out.println("a1.weight = " + a1.weight);


    }
    //if there is a variable to use in child class on the condition of creating object from Dog class,
    // the class don't need to go parent class
    //if there is no usable variable in the class, then goes there

    //compile time error is the "red underline"

    //Animal dog = new Dog();
    //here we create dog object from Animal class(it is object's data type)
    //data type can be the class name and parent class name but not child class's name






}
