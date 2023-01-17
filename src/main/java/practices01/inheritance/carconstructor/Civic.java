package practices01.inheritance.carconstructor;

public class Civic extends Honda{
    public void ecoEngine(){
        System.out.println("Civic uses eco engine");
    }
    public Civic(){//default constructor
        System.out.println("Civic class constructor 1");
    }
    public Civic(int year){//our constructor, not default, when we create our constructor, java deletes the default one
        super(true);
        System.out.println(year);
    }


}
