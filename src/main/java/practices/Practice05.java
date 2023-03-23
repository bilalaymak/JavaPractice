package practices;

public class Practice05 {
    public static void main(String[] args) {
/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 2 int values, return true if one or the other is teen, but not both.
loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
 */
        System.out.println(loneTeen(11, 20));

    }

    public static boolean loneTeen(int a, int b) {
        if ((a > 12 && a < 20) && (b > 12 && b < 20)){
            return false;
        }
        if ((a > 12 && a < 20) ||(b > 12 && b < 20) ){
            return true;
        }
        return false;
//        boolean aTeen = (a > 12 && a < 20);
//        boolean bTeen = (b > 12 && b < 20);
//        return (aTeen && !bTeen) || (!aTeen && bTeen);


    }



}
