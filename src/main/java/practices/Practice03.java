package practices;

public class Practice03 {
    public static void main(String[] args) {

/*
Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
Use the % "mod" operator -- see Introduction to Mod
or35(3) → true
or35(10) → true
or35(8) → false
 */

        System.out.println(number(34));


    }

         public static boolean number(int num){
         if(num>0){
             if (num %3 ==0 || num % 5 == 0){
                 return true;
             }else {
                 return false;
             }
         }else {
             return false;
         }
              
}



}
