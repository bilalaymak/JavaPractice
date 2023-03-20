package practices.practiceExtend.IfStatement;

import java.util.Scanner;

public class IfDiscriminant {
    public static void main(String[] args) {


/* Günün sorusu: if statement
      katsayıları verilen 1 bilinmeyenli denklemin kökleriniz bulunuz.
        ax² + bx + c;
        Çözüm adımları
        kullanıcıdan a,b,c yi alın.
        Diskriminant formülü: (-b +/- karekök(delta)) / (2*a)
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d))/ (*2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.
   */

        Scanner input = new Scanner(System.in);
        System.out.println("denklemin a,b ve c katsayilarini sirayla giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double delta = b*b -4 * a * c;//b(kare) -4ac

        if(delta > 0){
           double x1 = (-b + Math.sqrt(delta)) / (2*a);
           double x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("Denkleminiz: "+a+"x² + "+b+"x + "+c+";");
            System.out.println("denklemin iki koku vardir: x1 = " + x1 + " ve x2 = " + x2 );
            //denklemin iki koku vardir: x1 = -1.0 ve x2 = -2.0
        } else if (delta==0) {
            double x = -b/(2*a);
            System.out.println("Denkleminiz: "+a+"x² + "+b+"x + "+c+";");
            System.out.println("denklemin 1 koku vardir: x1 = " + x);//denklemin 1 koku vardir: x1 = -1.0

        }else {
            System.out.println("Denkleminiz: "+a+"x² + "+b+"x + "+c+";");
            System.out.println("denklemin koku yoktur");
        }


    }
}












