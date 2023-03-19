package step02.constructersmMethodcallsstaticksAccessmodifiers.variabletypes;

public class Runner {
    public static void main(String[] args) {

        //to access a non-static variable we have to create object
        VariableType01 obj = new VariableType01();

        System.out.println(obj.name);//Tom Hanks

        //actually we can access to static class members by using objects,
        //but it is not recommended(it is a big mistake)
        System.out.println(obj.age);//13

        //to create a static variable no need to create object
        //just class name is enough to reach
        System.out.println(VariableType01.age);//13

        System.out.println(obj.add(3, 5));//8
        System.out.println(obj.multiply(5, 6));//30


    }
}
