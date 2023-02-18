package practices02.inheritance.animalmethod;

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








    }

}
