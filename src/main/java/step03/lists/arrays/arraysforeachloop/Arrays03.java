package step03.lists.arrays.arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {


        //Example 1: type code to check if a specific element exists in an Array or not

        String s = "type code to check if a specific element exists in an Array or not";

        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));
        //[type, code, to, check, if, a, specific, element, exists, in, an, Array, or, not]

        //1. way

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

        //2. way we will use binarySearch() method
        // i) if the element exists binarySearch() method returns the index of the element

        Arrays.sort(words);//sorted the array in alphabetical order
        System.out.println(Arrays.toString(words));
        //[Array, a, an, check, code, element, exists, if, in, not, or, specific, to, type]
        int idxElement= Arrays.binarySearch(words,"Array");
        // the 1. paramater: name of Array, second: the element wanted to be known exists
        System.out.println(idxElement);//0 ==> the index of the element

        int idxMimami = Arrays.binarySearch(words, "Miami");
        System.out.println(idxMimami);
        //-2 ==> (-)negative means, it does not exist, (2) means,if it exists, it would be 4th element




















    }
}
















