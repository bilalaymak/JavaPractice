package practices02.inheritance.carconstructor;

public class Honda extends Car{
    public void hondaMake(){
        System.out.println("this car was made in honda factory");
    }
    public Honda(){
        System.out.println("Honda class constructor 1");
    }
    public Honda(boolean isNew){
        super("Hybrid");
        if (isNew){
            System.out.println("brand new");
        }else {
            System.out.println("used");
        }
    }



}
