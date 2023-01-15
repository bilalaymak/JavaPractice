package practices01.stringbuilder;

public class StringBuffer {
    public static void main(String[] args) {

         /*
         StringBuffer is another class to create Strings in Java
         StringBuffer is very similar with StringBuilder Class, I mean both are mutable

         What is the difference between StringBuilder and StringBuffer?
         1) StringBuffer was created before StringBuilder in Java
         2) StringBuffer is "multi-thread(multitask)" but StringBuilder is not
            StringBuilder does just one task, while StringBuffer does multi tasks to do
         3) StringBuffer is using "multi-thread"(coklu dizin) characteristic because of that it is slower than StringBuilder

         Scenarios:
         1) I need immutable String ==> String Class
         2) I need mutable and not multi-thread ==> StringBuffer
         3) I need mutable and multi-thread ==> StringBuffer

         when we use multi-thread we need to create an order for the threads, this called "synchronization"
         */


    }
}
