package practices.practiceExtend.stringmanipulation;

import java.util.Arrays;

public class UpperCase {
    public static void main(String[] args) {

        String s1 = "Java kolaydır";
        System.out.println(s1.toUpperCase());

        System.out.println('b'> 'B');

        System.out.println('a' + 0);


        /* char ch = '';
        System.out.println(ch); // Compile Time Error verir

        byte b1 = 10;
        byte b2 = 20;
        byte b3 = b1 * b2;
        System.out.println(b3); //hata verir 200> byte (127 değer aralığı olduğundan)


         */

        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};

        System.out.println(Arrays.equals(arr1, arr2));// true




    }
}
