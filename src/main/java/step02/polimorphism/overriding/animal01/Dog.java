package step02.polimorphism.overriding.animal01;



public class Dog extends Mammal {
    @Override //This is Annotation and checks the Overriding rules.
    //If you do any mistake in Overriding, you will get CTE
    public void eat() {
        System.out.println("Dogs eat");
    }

    public void bark(){
        System.out.println("Dogs bark");
    }










}
