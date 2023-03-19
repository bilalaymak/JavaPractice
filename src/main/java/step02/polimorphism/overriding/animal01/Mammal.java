package step02.polimorphism.overriding.animal01;

public class Mammal extends Animal{

    public void feedBabyWithMilk(){
        System.out.println("Mammal feed their baby with milk");
    }

    @Override
    public Animal myMethod() {
        return new Mammal();
    }










}
