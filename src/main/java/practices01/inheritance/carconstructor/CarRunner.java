package practices01.inheritance.carconstructor;

import java.lang.reflect.Method;

public class CarRunner {
    public static void main(String[] args) {
        Civic c = new Civic();
        /*
        Car class constructor 1
        Honda class constructor 1
        civic class constructor 1
         */
        Civic d = new Civic(2023);
        /*
        it comes up to down!!
        Hybrid
        brand new
        2023
         */
    }
}
