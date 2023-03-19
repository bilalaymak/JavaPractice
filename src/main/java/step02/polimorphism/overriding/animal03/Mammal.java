package step02.polimorphism.overriding.animal03;

public class Mammal extends Animal{

    public void feed(){
        System.out.println("mammals feed their babies with milk");
    }
    public Mammal occur(){
        return new Mammal();
    }





}
