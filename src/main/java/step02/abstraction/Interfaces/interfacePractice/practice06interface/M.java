package step02.abstraction.Interfaces.interfacePractice.practice06interface;

public class M implements K,L{


    @Override
    public String mA() {
        return a + " " + b;
    }

    @Override
    public String mB() {
        return b + " " + a;
    }



}
