package step02.polimorphism.overriding.animal03;

public class Cat extends Mammal{


    @Override  //override annotation ==> checks the overriding rules
    protected void eat() { //overriding method
        System.out.println("cats eat");
    }

    @Override
    public Cat create() {//the name of overriding method name can be also Animal
        //When you change the "return type" in "method overriding",
        //from child to parent you must have "IS-A" relationship.
        return new Cat();
    }

    @Override
    public Mammal occur() {//the name of overriding method name can be also Mammal but not Animal
    //Return Type of the Overridden Method can be
    //the "top return type" of the Overriding Method
        return new Cat();
    }

    @Override
    public Integer number() {
    //Between the "Wrapper Classes" there is no "parent-child relationship"
    //that is why you cannot have "IS-A" relationship
    //If you do not have "IS-A" relationship
    // you cannot change return type in "Method Overriding"
        return 456;
    }

    @Override
    public int num() {
    //Between the "primitive data types" there is no "parent-child relationship"
    //that is why you cannot have "IS-A" relationship
    //If you do not have "IS-A" relationship
    //you cannot change return type in "Method Overriding
        return 24;
    }











}
