package practices03.exceptions;

public class E06 {
    public static void main(String[] args) {

//        doCombo("12345",2);
//        System.out.println("****************");
//        doCombo("12345a", 0);
//        System.out.println("******************");
//        doCombo(null,2);//

        System.out.println("*****************");
        doCombo2(null,2);
        doCombo2("12345a", 0);


    }
    //create a method
    //i) find the length of the string
    //ii) convert the string to an integer
    //iii) divide the integer by a given number
    public static void doCombo(String str, int num){

        try {
            int length = str.length();//str.length(); will throw NullPointerException :null
            int convertStringToInt = Integer.valueOf(str);//NumberFormatException: For input string: "12345a"
            double division = convertStringToInt / num;//ArithmeticException: : / by zero
            System.out.println("str.length() = " + length);//str.length() = 5
            System.out.println("Integer.valueOf(str) = " + convertStringToInt);//Integer.valueOf(str) = 12345
            System.out.println("convertStringToInt/num = " + division);//convertStringToInt/num = 6172.0
        }catch (NullPointerException e){
            System.out.println("there is a problem in finding length " + e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("there is a problem in conversion " + e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("there is a problem in division " + e.getMessage());
        }
        System.out.println("execution did not stop");
    }

    //2. way: it is recommended
    public static void doCombo2(String str, int num){

        try {
            int length = str.length();//str.length(); will throw NullPointerException :null
            int convertStringToInt = Integer.valueOf(str);//NumberFormatException: For input string: "12345a"
            double division = convertStringToInt / num;//ArithmeticException: : / by zero
            System.out.println("str.length() = " + length);//str.length() = 5
            System.out.println("Integer.valueOf(str) = " + convertStringToInt);//Integer.valueOf(str) = 12345
            System.out.println("convertStringToInt/num = " + division);//convertStringToInt/num = 6172.0
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("execution did not stop");
    }










}
