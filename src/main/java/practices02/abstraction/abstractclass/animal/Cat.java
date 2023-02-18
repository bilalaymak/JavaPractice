package practices02.abstraction.abstractclass.animal;

public class Cat extends Mammal{//concrete class





    public void meow(){
        System.out.println("cats meow");
    }

    @Override
    public void eat() {
        System.out.println("cats eat");
    }

    @Override
    public void drink() {
        System.out.println("cats drink");
    }




}
