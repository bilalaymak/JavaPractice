package practices01.stringbuilder;

public class StringBuilder02 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Mississippi");

        //toString() is used to change StringBuilder to Strings
        String test = sb1.toString();
        System.out.println(test);//Mississippi

        //reverse method is used to reverse a String
        //if you get a question like "how to reverse a String" tell him;
        //i) I can reverse a String by using reverse() method from StringBuilder Class
        //ii) I can reverse a String by using loops
        //interviewer will tell us use the loops
        StringBuilder revSb1 = sb1.reverse();
        System.out.println(revSb1);//ippississiM

        //deleteCharAt() is used to delete a character at a specific index
        sb1.deleteCharAt(0);
        System.out.println(sb1);//ppississiM
        sb1.length();//unbold(koyu renkli olmayan) methods do not change the original values

        //note: when we use method for StringBuilder,
        // if it is "bold" and "not coming from String Class" it changes the original value
        //delete(starting index, ending index) is used to delete a characters from starting idx to ending idx
        //starting idx is inclusive, ending idx is exclusive
        sb1.delete(2,5);
        System.out.println(sb1);//ppissiM

        //replace(starting idx, ending idx, new value) is used to change characters
        // from starting idx to ending idx to a new value
        sb1.replace(2,4,"IS");
        System.out.println(sb1);//ppISsiM

        //insert(number of characters from the beginnig, new value)
        //method will insert "new value" after skipping "number of characters from the beginning"
        sb1.insert(3,"XXX");//skip three characters and put 3 XXX
        System.out.println(sb1);//ppIXXXSsiM

        StringBuilder sb2 = new StringBuilder("Java is love");
        StringBuilder sb3 = new StringBuilder("Mava is love");

        /*
        the value 0 if the first StringBuilder contains the same character sequence as that of the argument StringBuilder;
        a negative integer if the first StringBuilder is lexicographically less than the second StringBuilder argument;
        or a positive integer if the first StringBuilder is lexicographically greater than the second StringBuilder argument.
        java does this according to ASCII values

        note: compareTo() method does not ignore cases, it checks alphabetical order by using ASCII Values
         */

        int result = sb2.compareTo(sb3);
        System.out.println(result);//-3

        //setcharAt(idx, new char value) is used to update a specific character at specific idx
        sb3.setCharAt(8,'m');
        System.out.println(sb3);//Mava is move

        /*  you should understand:
           1) mechanism behind the "immutability"
           2) benefits of "immutability"
           3) difference between "immutability" and "mutability"
           4) features of the StringBuilder
         */



    }
}













