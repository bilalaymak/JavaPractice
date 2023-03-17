package step01.loops.dowhileloops;

public class DoWhile03 {
    public static void main(String[] args) {
        /*
        type code to print digits just in the decimal part of the given decimal number with an asterix
        for example; 75.4238 ==> *4*2*3*8
         */

        double num = 75.4238;
        String str = String.valueOf(num);
        String s = ""; //start point like int sum = 0; replace of String
        int i = 0;
        String decPart = str.split("\\.")[1];//when we use just "." in split() method
        // we must use backward slash (\\.)

        System.out.println("decimal part is " + decPart);

        do {
          String r = decPart.substring(i,i+1);
         s = s + "*" + r;
         i++;
        }while (i < decPart.length());
        System.out.println(s);
    }
}
