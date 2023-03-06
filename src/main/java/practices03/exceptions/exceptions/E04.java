package practices03.exceptions.exceptions;

public class E04 {

    public static void main(String[] args) {

        int r1 = convertStringToInt("123");
        System.out.println(r1 +1);//124

        int r2 = convertStringToInt("123a");
        System.out.println(r2);//NumberFormatException : For input string: "123a"
        //if you use "valueOf()" method with a String has non-digit character in it,
        //you will have "NumberFormatException"


    }

    //create a method to convert a string to an integer

    public static int convertStringToInt(String str){
            int num = 0;
       try {
          num = Integer.valueOf(str);
       }catch (NumberFormatException e){
           System.out.println("NumberFormatException : a problem occurred while I convert the string to integer "
                   + e.getMessage());
           //NumberFormatException : a problem occurred while I convert the string to integerFor input string: "123a"
       }
         return num;
    }





}
