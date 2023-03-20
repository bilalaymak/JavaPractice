package practices.practiceExtend.practices;

public class Varargs01 {
    public static void main(String[] args) {

       int two =  addTwoNumbers(3,5);
       int three =  addThreeNumbers(4,7,2);
       int addWarargs =  add(1,2,3,4,5,6,7,8,9);//we can add whatever we want to add
        System.out.println(two);
        System.out.println(three);
        System.out.println(addWarargs);



    }
    // create a method to sum the number whatever you want
    public static int add(int... a){
        int sum = 0;
        for (int w: a){
            sum = sum + w;
        }
        return sum;
    }
    //create a method to sum two numbers
    public static int addTwoNumbers(int a, int b){
        return a + b;
    }
    public static int addThreeNumbers(int a, int b, int c){
        return a+b+c;
    }


}
