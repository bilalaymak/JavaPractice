package step02.abstraction.Interfaces.car01;

import step02.abstraction.Interfaces.honda01.AC;
import step02.abstraction.Interfaces.honda01.Brake;
import step02.abstraction.Interfaces.honda01.Engine;
import step02.abstraction.abstraction.car01.Honda;

public class CarRunner {
    public static void main(String[] args) {

        Honda h = new Honda();
        System.out.println("AC.price = " + AC.price);
        System.out.println("Engine.price = " + Engine.price);
        System.out.println("Brake.price = " + Brake.price);
        System.out.println("Brake.luxury = " + Brake.luxury);

        System.out.println("h.calculate() = " + AC.calculate());
        //1200 we called it from default keyword

        System.out.println("AC.climate() = " + AC.climate());
        //true  we called it from static keyword


    }
}
