package step02.polimorphism.overriding.animal01;

public class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("Birds eat");
    }

    @Override
    public void drink() {
        System.out.println("Birds drink");
    }

    public void tweet(){

        System.out.println("Birds tweet");
    }






}
