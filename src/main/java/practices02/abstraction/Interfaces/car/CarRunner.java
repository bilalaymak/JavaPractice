package practices02.abstraction.Interfaces.car;

import practices02.abstraction.Interfaces.AC;
import practices02.abstraction.Interfaces.Brake;
import practices02.abstraction.Interfaces.Engine;
import practices02.abstraction.Interfaces.Honda;

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
