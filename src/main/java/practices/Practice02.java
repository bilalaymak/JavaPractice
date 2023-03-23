package practices;

public class Practice02 {
    public static void main(String[] args) {
    /*    Given a string, return a new string where the first and last chars have been exchanged.
                frontBack("code") → "eodc"
        frontBack("a") → "a"
        frontBack("ab") → "ba"
*/

        String str = "code";

        System.out.println(frontBack(str));

    }

    public static String frontBack(String str){
        return str.charAt(str.length()-1) + str.substring(1, str.length()-1) + str.charAt(0);
    }


}
