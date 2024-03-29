package step03.lists.arrays.arrays;

import java.util.Arrays;

public class Arrays05 {

    public static void main(String[] args) {

        /*
        1)primitive variables and Strings can store just a single data in them.
        Sometimes we need to "store multiple data " in a single container.To be able to
        store multiple data in a single container, Java created a new structure called "Arrays".

        2) Arrays cannot store "non-primitives", if you see "non-primitives" were stored actually
        they are the references of non-primitives.
        Arrays can store i)primitive data types and ii) references of non-primitives
         */

          /*
        Note 1: "for-each loop" can be used with "Arrays" and "Collections",
        if there is no Arrays and collections
        you cannot use for-each loop, you have to use for-loop or while-loop or do while loop.

        Note 2: Sometimes for-each loop cannot be used with Arrays and Collections as well.
        When using indexes is a must, using for-each loop is impossible.
         */

        //Example 1: Create an integer array and print elements less than 10 on the console.
        int ages[] = new int[7];
        ages[0] = 13;
        ages[1] = 6;
        ages[2] = 19;
        ages[3] = -8;
        ages[4] = 10;
        ages[5] = 2;
        ages[6] = 87;

        //1. Way:       //13, 6, 19, -8, 10, 2, 87
        for(int w : ages){
            if(w<10){
                System.out.print(w + " ");// 6 -8 2
            }
        }

        //2.Way:
        Arrays.sort(ages);
        // -8, 2, 6, 10, 13, 19, 87
        for(int w : ages){
            if(w>=10){
                break;
            }else{
                System.out.print(w + " ");
            }
        }

        //Example 2: Create an integer array and print elements greater than 10 on the console.
        int nums[] = new int[7];
        nums[0] = 13;
        nums[1] = 6;
        nums[2] = 19;
        nums[3] = -8;
        nums[4] = 10;
        nums[5] = 2;
        nums[6] = 87;

        System.out.println();

        //1.Way:
        for(int w : nums){
            if(w>10){
                System.out.print(w + " ");
            }
        }

        System.out.println();

        //2.Way:
        Arrays.sort(nums);// -8, 2, 6, 10, 13, 19, 87

        for(int i=nums.length-1; i>=0; i--){
            if(nums[i]<=10){
                break;
            }else{
                System.out.print(nums[i] + " ");
            }
        }

        System.out.println();

        //3.Way:
        for(int w : nums){

            if(w<=10){
                continue;//If you want to skip element or elements in a loop use "continue" keyword.
            }else{
                System.out.print(w + " ");
            }

        }
    }
}
