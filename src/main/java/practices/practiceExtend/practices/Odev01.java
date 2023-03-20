package practices.practiceExtend.practices;


import static java.lang.Math.pow;

public class Odev01 {
    //1)Dikdirtgenin alanini hesaplayan methodu olusturunuz ve kullaniniz
//2)Dikdirtgenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
//3)Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz
//4)Dairenin alaninio hesaplayan methodu olusturunuz ve kullaniniz

    public static void main(String[] args) {


        int resultOfPermeterRectangle = permeterOfRectangle(12,21);
        System.out.println(resultOfPermeterRectangle);

        int resultOfAreaRectangle = areaOfRectangle(23,32);
        System.out.println(resultOfAreaRectangle);

        double resultCircumferenceOfCircle = circumferenceOfCircle(5);
        System.out.println(resultCircumferenceOfCircle);

        double resultAreaOfCircle = areaOfCircle(6);
        System.out.println(resultAreaOfCircle);



    }
    public static int areaOfRectangle(int a, int b) {

        return a * b;
    }
    public static int permeterOfRectangle(int a, int b) {

        return (a + b) * 2 ;
    }
    public static double pi = Math.PI;
    public static double circumferenceOfCircle(double r){

        return 2 * pi * r;
    }
    public static double areaOfCircle(double r){

        return pi * pow(r,2);
    }





}
