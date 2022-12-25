package practices01.arrays.arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {


        //Example 1: type code to check if a specific element exists in an Array or not

        String s = "type code to check if a specific element exists in an Array or not";

        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));
        //[type, code, to, check, if, a, specific, element, exists, in, an, Array, or, not]

        int counter = 0;
        String element = "type";

        for(String w : words){
            if(w.equals(element)){
                counter++;
            }
        }
        if (counter>0){
            System.out.println("There are " + counter + " times " + element);//There are 1 times 23

        }else {
            System.out.println("It does not exist" );
        }


















    }
}
















