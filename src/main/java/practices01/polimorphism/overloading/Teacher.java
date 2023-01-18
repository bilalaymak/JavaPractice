package practices01.polimorphism.overloading;

public class Teacher {

    public static void main(String[] args) {


    /*
       note: method overloading has another name which is "static polymorphism"
      1) if you create a method with the same name and different parameters, ti means you are doing "method overloading"
      2)"method overloading" happens in a single class, therefore we do not need "inheritance" for "method overloading"
      3) to do "method overloading"
        i)  do not change the method name
        ii) change the parameters by changing the
        a)  number of the parameters
        b)  data types of the parameters
        c)  places of parameters by changing data types
      4) "private" methods can be "overloaded"
      5) "final" methods can be "overloaded"
      6) "static" methods can be "overloaded"
      7) why do we need "method overloading"?

      Note: method overloading + method overriding = polymorphism(multiple forms in Latin)



    */

        add(3,5.0);//8.0 ==> 1. method is used
        add(8);//8 ==> 3. method  is used, but 4. method can be also used by using AW(auto Widening)
        add(3.0,5);//8.0 2. method is used


    }
     //1. method
    public static void add(int a, double b){
        System.out.println(a+b);
    }
    //2. method
    public static void add(double a, int b){
        System.out.println(a+b);
    }
    //3. method
    public static void add(int a){
        System.out.println(a);
    }
    //4. method
    public static void add(double a){
        System.out.println(a);
    }



}










