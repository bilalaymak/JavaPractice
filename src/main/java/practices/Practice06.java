package practices;

public class Practice06 {
    public static void main(String[] args) {
/*
Given a string, return a string made of the first 2 chars (if present),
however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
 */


}


    public String startOz(String str) {
        String result = "";
        if (str.charAt(0) == 'o') {
            result += 'o';
        }
        if (str.charAt(1) == 'z') {
            result += 'z';
        }
        return result;
    }
}
