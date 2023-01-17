package practices01.inheritance.carconstructor;

public class Car{
    public void engine(){
        System.out.println("all cars have engine");
    }
    public Car(){
        System.out.println("Car class constructor 1");
    }
    public Car(String engineType){
        super();//no need to put super() hear, java puts it as default
        System.out.println(engineType);
    }
}
