package practices01.constructersmethodcallsstatickeywords.statickeyword;

public class Static01 {

    //Example 1:
    static int a =10; //static variable

    public static void main(String[] args) {
        Static01 t1= new Static01();// we created an object from Static01 class
        Static01 t2 =new Static01();// we created another object from Static01 class

        t1.a =a + 2;
        t2.a = a+ 3;
        System.out.println(t1.a);//15  // go to the t1 object, then look at the t1 (we see t1 as 10+2+3=15)
        System.out.println(t2.a);//15
        //static values are common for all object
        //when we update static value, all variables and methods and object used static variables which
        // attached to the Static01 class


    }

    public static class Static02 {  //example 2:
        int a = 10; //variable is non-static

        public static void main(String[] args) {
            // if a variable is not a static variable, we can attach it to an object independent of the class

            Static02 t1= new Static02();//12
            Static02 t2 =new Static02();//13

            t1.a = 12; // means: make the "a" in the t1, 12
            t2.a = 13; //make the "a" in the t2, 13

            // that is, to update in t1 doesn't affect t2, when we change a=10 in the t1,
            // it doesn't change a=10 in the t2
            System.out.println(t1.a);//13
            System.out.println(t2.a);//13
        }
    }

    public static class Student {

        String name;//non-static variable attached to the objects / its current value is null,
        //because we don't assign any value to it
        //we don't use access modifier, so it is default
        static String collage = "UNF";//static variable attached to the Student class

        Student(String n , String collage){//constructor( its name is the same with the class name
            // and does not have return type
            this.name= n;
            this.collage = collage; // "this" means "this collage"
        }

        public static void main(String[] args) {

            Student s1 = new Student("Mark","UCF");
            //object of s1 (now, the name is "Mark" and the collage is "UCF")
            Student s2 = new Student("Kevin", "FIU");
            //object of s2 (now, the name is  "Kevin" and the collage name is "FIU"

            System.out.println(s1.name);//Mark
            System.out.println(s2.name);//Kevin

            System.out.println(s1.collage);//FIU
            System.out.println(s2.collage);//FIU

        }






    }

    public static class Counter {

        int count = 0;//non-static
        Counter(){//constructor
            count+= 2;
            System.out.println(count);
        }

        public static void main(String[] args) {
            Counter c1 = new Counter();//2
            Counter c2 = new Counter();//2
            Counter c3 = new Counter();//2
        }
    }

    public static class Test1 {
        int y = 5;
        static int x = 7;

        public static void main(String[] args) {
            Test1 t1 = new Test1();
            Test1 t2 = new Test1();

            t1.x= 17;// go to t1 , and make it 17
            t1.y = 15;// go to t1, and make it 15

            System.out.print(t1.x + "");//17
            System.out.println(t2.x);// x is 17; because x is static, so x is updated also in the t2 object

            System.out.print(t1.y + "");//15
            System.out.println(t2.y);//5 because y is never changed in th t2 object


        }
    }

    public static class StaticDemo {

        int num1 = 5;
        static int num2 = 7;

        public static void main(String[] args) {

            StaticDemo s1 = new StaticDemo();
            StaticDemo s2 = new StaticDemo();

            s1.num1 = 13;//13
            s1.num2 = 23;//43
            s2.num1 = 33;//33
            s2.num2 = 43;//43

            System.out.println(s1.num1 + " " + s1.num2 + " " + s2.num1 + " " + s2.num2);
        }



    }
}

















