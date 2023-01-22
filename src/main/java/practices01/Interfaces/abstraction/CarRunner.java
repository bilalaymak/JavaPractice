package practices01.Interfaces.abstraction;

import practices01.Interfaces.AC;
import practices01.Interfaces.Brake;
import practices01.Interfaces.Engine;
import practices01.Interfaces.Honda;

public class CarRunner {
    public static void main(String[] args) {

        Honda h = new Honda();
        System.out.println("AC.price = " + AC.price);
        System.out.println("Engine.price = " + Engine.price);
        System.out.println("Brake.price = " + Brake.price);
        System.out.println("Brake.luxury = " + Brake.luxury);

        System.out.println("h.calculate() = " + h.calculate());
        //1200 we called it from default keyword

        System.out.println("AC.climate() = " + AC.climate());
        //true  we called it from static keyword


    }
}
