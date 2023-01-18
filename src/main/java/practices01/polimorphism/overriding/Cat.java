package practices01.polimorphism.overriding;

public class Cat extends Mammal{

    public String name = "Cat";

    public Cat(){
        System.out.println("4 " + name);//Cat
        System.out.println("5 " + super.name);//Mammal
    //super. means go to (just) the parent and find "name"
    }


    @Override//overriding method
    //we did override to do specific implementation
    public void eat() {

        System.out.println("Cats eat");
    }

    @Override
    public Mammal create() {
        return new Mammal();
    }

    @Override
    public Integer add() {//we cannot change return type whether is Wrapper or primitive
        return 23;
    }
    public int multiply(){
        return 46;
    }



}
