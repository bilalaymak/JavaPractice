package practices01.arrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //example 1: create a String Array and print the elements in alphabetical order
        // on the console in different lines

        String arr[] = new String[5];
        arr[0] = "Ahmet";
        arr[1] = "Mehmet";
        arr[2] = "Ali";
        arr[3] = "Ayse";
        arr[4] = "Fatma";

        System.out.println(Arrays.toString(arr));//[Ahmet, Mehmet, Ali, Ayse, Fatma]

        //how to put elements in alphabetical order

        Arrays.sort(arr);//to put them in alphabetical order  (sort(arr))
        System.out.println(Arrays.toString(arr));//[Ahmet, Ali, Ayse, Fatma, Mehmet]

        for (String w: arr // to get return in different lines
             ) {
            System.out.println(w);
        }
/*
Ahmet
Ali
Ayse
Fatma
Mehmet
 */
       //we can use Arrays in a short way to create and add elements into the Array
/*
        String cities[] = new String[5];
        cities[0] = "Tokyo";
        cities[1] = "Berlin";
        cities[2] = "Istanbul";
        cities[3] = "Jacksonville";
        cities[4] = "Calgary";
*/
        String cities[] = {"Tokyo","Berlin","Istanbul","Jacksonville","Calgary"};

        System.out.println(Arrays.toString(cities));//[Tokyo, Berlin, Istanbul, Jacksonville, Calgary]
        Arrays.sort(cities);
        System.out.println(Arrays.toString(cities));//[Berlin, Calgary, Istanbul, Jacksonville, Tokyo]

        //to get the number of characters from a String, use "length()"
        //to get the number of elements from an Array use "length"

        // Example 2 :  Create a String Array and print the elements whose length is less than 5

        String names[] ={"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};
        System.out.println(Arrays.toString(names));//[Ali, Thomas, Mark, Jackson, Tom, Martin]

        for (String w:
             names) {
            if(w.length()< 5)            // "w" represents Array elements
                System.out.println(w); // Ali , Mark, Tom were printed, because the others are more than 5
        }











    }
}
