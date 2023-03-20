package practices.practiceExtend.incrementdecrement;

public class IncrementDecrement {
    public static void main(String[] args) {

        int a = 12;
        int b = a++;//Post Increment
        System.out.println(b);
        System.out.println(a);
///////// ****************************************** \\\\\\\\\\\\\\\\\\\\
        int x = 15;
        int y = x--;//Post Decrement
        System.out.println(x);
        System.out.println(y);
///////// ****************************************** \\\\\\\\\\\\\\\\\\\\
        int m = 21;
        int n = ++m;//Pre Increment
        System.out.println(m);
        System.out.println(n);
///////// ****************************************** \\\\\\\\\\\\\\\\\\\\
        int t = 32;
        int u = --t;// Pre Decrement
        System.out.println(t);
        System.out.println(u);
///////// ****************************************** \\\\\\\\\\\\\\\\\\\\

        int sayi = 10;
        sayi++;
        System.out.println(sayi);
        sayi++;
        System.out.println("pre-incrementten once " + sayi);
        System.out.println(" pre-increment satırında " + ++sayi);
        System.out.println("pre-incrementden  sonra" + sayi);

        System.out.println("post-increment satırında" + sayi++);
        System.out.println("post-incrementdan sonra " + sayi);
        System.out.println(9f / 2f);
        System.out.println(9 / 2);

///////// ****************************************** \\\\\\\\\\\\\\\\\\\\

        int num = 15;
        int num2 = num++;
        System.out.println(num2);
        System.out.println(num);

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;

        sayi2 = sayi1++;
        System.out.println(sayi1 + "," + sayi2 + "," + sayi3);

        sayi3 = ++sayi1;
        System.out.println(sayi1 + "," + sayi2 + "," + sayi3);

        System.out.println(sayi3++);

        System.out.println(--sayi2);

        System.out.println(sayi3++);

        System.out.println(sayi3);




    }
}
