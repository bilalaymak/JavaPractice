package practices01.constructersmethodcallsstatickeywords.staticblock;

public class StaticExample02 {
    static int a = 11;

    public static void main(String[] args) {
        int b = 12;
        System.out.println(b);//12
    }
    static {
        int c = 13;
        System.out.println(c);//13
    }
    static {
        a = 14;
        System.out.println(a);//14
    }

    //the order of the console ==> 13 14 12
}

