package practices02.inheritance.mammalsvariable;

public class Dog extends Mammals {


    private boolean bark = true;

    public static void main(String[] args) {
        Dog dog = new Dog();//we create the object from Dog class, our references is related to Dog class
        System.out.println(dog.bark);//true
        System.out.println(dog.feed);//true
        System.out.println(dog.weigth);//13
    }
    //if there is a variable to use in child class on the condition of creating object from Dog class,
    // the class don't need to go parent class
    //if there is no usable variable in the class, then goes there

    //compile time error is the "red underline"

    //Animal dog = new Dog();
    //here we create dog object from Animal class(it is object's data type)
    //data type can be the class name and parent class name but not child class's name

    //in inheritance, when we call a method, we focus on constructor
    // C b = new "B()";
    //we call method ( b.m(); ) from B class
    // but when we use sout(b.x) we focus on data type, go to C class

}
