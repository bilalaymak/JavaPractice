package step02.abstraction.Interfaces.honda01;

public class Honda implements AC, Brake, Engine {


    @Override //from AC
    public void digital() {
        System.out.println("this is digital AC");
    }

    @Override
    public void secureBrake() {
        System.out.println("it stops security");
    }

    @Override
    public void ecoEngine() {
        System.out.println("this is eco engine");
    }

    @Override
    public void price() {//just one price() method is enough to override
        System.out.println("Brake price");
    }


}
