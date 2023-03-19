package step02.constructersmMethodcallsstaticksAccessmodifiers.staticblock;

public class StaticExample01 {
    static int a = 11;

    public static void main(String[] args) {
        int b = 12;
        System.out.println(b);
    }

    static {
        a = 13;
        System.out.println(a);  // on the console 13, 12
    }
}

