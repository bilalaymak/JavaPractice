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
    public  Car(int engineSize){
        this("gas");
        System.out.println(engineSize);
    }
    public  Car(String engineMake, int enginePrice){
        this(5000);//this() goes to constructor has int parameter in the same class
        //so this() method looks like super() method in the inheritance but is different
        System.out.println(engineMake + " - " + enginePrice);


    /*
          1)this() is used to call constructor from the same class
          2)this() must be in the first line in a constructor body
          3)this() is used to call constructor from the same class, super() is used to call
            constructor from parent class

    */

    }
}
