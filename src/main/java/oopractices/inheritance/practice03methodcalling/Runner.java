package oopractices.inheritance.practice03methodcalling;



public class Runner {
    public static void main(String[] args) {



        Dog dog = new Dog();
        //we can access to every variable from dog class to Animal class
        System.out.println("dog.a = " + dog.a);
        System.out.println("dog.b = " + dog.b);
        System.out.println("dog.c = " + dog.c);

        //if a variable is static we can call it with class name from dog class to Animal class
        System.out.println("Dog.c1 = " + Dog.c1);
        System.out.println("Dog.a1 = " + Dog.a1);


        //we can access to every method from dog class to Animal class
        dog.m1();
        dog.m2();
        dog.m3();

        Mammal m = new Mammal();

        //we can access the variables just from Mammal class to Animal class
        System.out.println("m.a = " + m.a);
        System.out.println("m.b = " + m.b);

        ////we can access methods just from Mammal class to Animal class
        m.m1();
        m.m2();

        Animal animal = new Animal();

        //from Animal class we access variables and methods in just Animal class
        System.out.println("animal.a = " + animal.a);
        animal.m1();

      //  Dog dog1 = new Mammal();
      // the constructor cannot be greater than the data type
      // if we do this, we have to "down casting" ==> Dog dog1 = (Dog) new Mammal();
        //and we reach just like the situation in case of which "Dog dog = new Dog();"

        //////////////////////////////////////////////////
      //but down casting has an exception risk to throw "ClassCastException "
//        Dog dog1 = (Dog) new Mammal();
//        System.out.println("dog1.a = " + dog1.a);
//        System.out.println("dog1.b = " + dog1.b);
//        System.out.println("dog1.c = " + dog1.c);
//        dog1.m1();
//        dog1.m2();
//        dog1.m3();

        //we can reach just variables and methods in Animal class
        Animal animal1 = new Dog();
        System.out.println("animal1.a = " + animal1.a);
        animal1.m1();

        Animal dog2 = new Mammal();
        System.out.println("dog2.a = " + dog2.a);
        dog2.m1();

        Mammal mammal = new Dog();
        System.out.println("mammal.a = " + mammal.a);
        System.out.println("mammal.b = " + mammal.b);
        mammal.m1();
        mammal.m2();


    }
}
