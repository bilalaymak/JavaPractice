package step02.inheritance.animal02;

public class Mammals extends Animal{

    public void feedBabyWithMilk(){
        System.out.println("Mammals feed their baby with milk...");
    }

    public Mammals(){
        System.out.println("Mammals constructor");
    }
}
