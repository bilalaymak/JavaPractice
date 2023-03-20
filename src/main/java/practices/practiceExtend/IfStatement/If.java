package practices.practiceExtend.IfStatement;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("lütfen a,b ve c değerleri için rakam giriniz");
        a = input.nextInt();
        System.out.println("a = " + a);
        b = input.nextInt();
        System.out.println("b = " + b);
        c = input.nextInt();
        System.out.println("c = " + c);
        //1. durum
        if (a>0){
            System.out.println(a+b+c);
        }
        if(b>a){
            System.out.println(a*b*c);
        }
        else {
            System.out.println("geçersiz işlem");
        }
        //2. durum
        int x,y,z;
        System.out.println("lütfen x,y ve z değerleri için rakam giriniz");
        x = input.nextInt();
        System.out.println("x = " + x);
        y = input.nextInt();
        System.out.println("y = " + y);
        z = input.nextInt();
        System.out.println("z = " + z);
        if (x>0){
            System.out.println(x+y+z);
        } else if (y>x) {
            System.out.println(x*y*z);
        }
        else {
            System.out.println("geçersiz işlem");
        }

    }
}
