package step02.polimorphism.overriding.animal02;

public class Animal {

    public String name = "Animal";

    public void eat(){//overridden method
        System.out.println("animals eat");
    }

    public Animal create(){//method
        return new Mammal();//this method gives a Mammal object and return us
    }
    public Integer add(){
        return 12;
    }
    public int multiply(){
        return 24;
    }
    public final int divide(){//we cannot override final method
        return 34;
    }
    private boolean isRetired(){//private methods cannot be overridden
        return true;
    }
    public static int counter(){//we cannot override static methods
        return 5;
    }

}
