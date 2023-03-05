package practices02.abstraction.abstractclass.gamecalculator;

public class Runner {
    public static void main(String[] args) {

        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.calculate();
        womanGameCalculator.gameOver();

//        GameCalculator gameCalculator = new GameCalculator() {
//            @Override
//            public void calculate() {
//
//            }
//        };
     //abstract classes cannot be instantiated(to become new), when we need to instantiate,
     //we should override its methods

        //however we can use its subclasses as constructor to implement the gameCalculator
        GameCalculator gameCalculator = new WomanGameCalculator();
        gameCalculator.calculate();
        gameCalculator.gameOver();

        //abstract classes is good why if we want to add a new feature to the game,
        //we don't need to create new objects to add this feature, we will just initialize the object













    }
}
