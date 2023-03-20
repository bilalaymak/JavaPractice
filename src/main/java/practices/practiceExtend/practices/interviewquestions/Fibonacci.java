package practices.practiceExtend.practices.interviewquestions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("how many fibonacci number do you want to see?");

        int number = input.nextInt();
        fibonacci(number);
        input.close();//burasi yazilmadan da calisiyor, close()
        // methodunu neden yazdik
        //close() metodu, Java'da Closeable ve AutoCloseable
        // arabirimlerinde tanımlanan bir metoddur.
        // Bu metod, nesnenin tuttuğu kaynakları serbest bırakmak için kullanılır
        // (örneğin açık dosyalar).
        //bu aciklamayi buldum ama anlamadim
    }
    public static void fibonacci(int number){
        int fibo1 = 1;
        int fibo2 = 1;
        int fibonacci = 0;
        System.out.print(fibo1 + " ");
        System.out.print(fibo2 + " ");

        for (int i = 1; i < number-1; i++){
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
            System.out.print(fibonacci + " ");
        }
    }


}
