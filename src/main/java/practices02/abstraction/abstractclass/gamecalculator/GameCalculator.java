package practices02.abstraction.abstractclass.gamecalculator;

public abstract class GameCalculator {

    //it is not mandatory to define methods in abstract classes as abstract
    //but in interfaces, it is mandatory to define
      public abstract void calculate();
      public final void gameOver() {
          System.out.println("Game over");
      }






}
