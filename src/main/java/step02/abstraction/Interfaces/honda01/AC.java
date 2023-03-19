package step02.abstraction.Interfaces.honda01;

/*
    1) an interface cannot have "concrete method"
    2) all methods in an interface are "public" and "abstract" as default
       because of that even you don't declare the methods "public" and "abstract",
       they will be "public" and "abstract" as default
       "public abstract void digital();" and "void digital();" are the same
    3) if "parent interfaces" have  methods with the same name,
       overriding just one of them will be enough
    4) "parent interfaces" cannot have methods with the same name and the different return types
       if you do that, java give you compile time error
    5) variables in an interface are "public", "static", and "final"
       "public static final int price = 2300;" and "int price = 2300;" are the same
    6) variables in interfaces are "static" default,
       therefore no need to create object to access variables in interfaces
    7) whenever you need to call any variable use "Interface Name" to call
    8) "class" parent of another "class" ==> extends
       "interface" parent of another "interface"  ==> extends
       "interface" parent of "class"  ==> implements
       "Class" parent of "interface"  ==> impossible
       ==> an "interface" can have "just" interface as parent

 */


public interface AC extends BigAC {

    void digital ();
    void price();

    int price = 2300;

    String name = "perfect AC";

    //to create "concrete method" in an interface you have 2 options
    // i) use "default" keyword
    public static int calculate(){
        return 1200;
    }

    // ii) use "static" keyword

    public static boolean climate(){
        return true;
    }


}









