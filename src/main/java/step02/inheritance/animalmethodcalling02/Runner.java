package step02.inheritance.animalmethodcalling02;

public class Runner extends Animal {
  //we looked how methods executes in inheritance
  //it comes related to our method call
    public static void main(String[] args) {
     Dog d = new Dog();// we create an object to access methods from the class
        d.bark();
        d.eat();
        d.drink();

        System.out.println("****************");

     Cat c = new Cat();
        c.eat();
        c.drink();
        c.meow();


        System.out.println("******************");

     Animal a = new Animal();//parent class cannot access to child classes, but child class can do
         a.drink();
         a.eat();


//         Cat x = (Cat) new Animal();//down casting
//        //but it throws "ClassCastException"
//        //normally we cannot access from Cat class to Animal() constructor, we did it by down casting
//        System.out.println("x.name = " + x.name);
//        System.out.println("x.year = " + x.year);
//        x.eat();
//        x.meow();
//        x.drink();

        Animal y = new Cat();
        //but we can access it from Animal class to Cat() constructor by up casting
        System.out.println("x.name = " + y.year);//we call year variable just in Animal class not in the child class
        y.drink();
        y.eat();



    }

}
