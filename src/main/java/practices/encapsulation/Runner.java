package practices.encapsulation;

public class Runner {


 /*
    Type code to calculate BMI (Do NOT ignore security).

    The BMI is defined as the body mass divided by the square of the body height.
    Major adult BMI classifications are underweight
    (under 18.5 kg/m2), normal weight (18.5 to 25), overweight (25 to 30), and obese (30 or more).
  */



    public static void main(String[] args) {
        BMI bmi = new BMI(77, 1.6);
        bmi.calculateBMI();

        BMI john = new BMI(87, 1.78);
        john.calculateBMI();

    }






}
