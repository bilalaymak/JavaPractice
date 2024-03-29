package step03.lists.arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList11 {
    public static void main(String[] args) {

        //example 1: find to  the closest int elements in a given list
        //           {12,15,10,14} ==> 14 and 15

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(15);
        nums.add(10);
        nums.add(14);

        System.out.println("nums = " + nums);//nums = [12, 15, 10, 14]
        Collections.sort(nums);
        System.out.println("sorted nums = " + nums);//sorted nums = [10, 12, 14, 15]

        int minDiff = nums.get(1) - nums.get(0);
        for (int i = 1; i < nums.size(); i++){
             minDiff = Math.min(minDiff, nums.get(i) - nums.get(i-1));
        }
        System.out.println("minDiff = " + minDiff);//minDiff = 1

        for (int i = 1; i < nums.size(); i++){
            if (nums.get(i) - nums.get(i-1) == minDiff){
                System.out.println(nums.get(i-1) + " and " + nums.get(i));//14 and 15
            }
        }



















    }


}
















