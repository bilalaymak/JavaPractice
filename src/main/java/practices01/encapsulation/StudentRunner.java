package practices01.encapsulation;

public class StudentRunner {

    public static void main(String[] args) {
    /*
                        (ENCAPSULATION)

      encapsulation is "data hiding"
      to hide a data, we make the access modifier "private"
      after "hiding data", you may need to "read" or "update" the data
      to "read" or "update" the data, we will create some methods
      to "read" "encapsulated data" you should create "get()" methods, we name it "getters"
      to "update" "encapsulated data" you should create "set()" methods, we name it "setters"

      note: "get()" and "set()" methods are called "Java Beans" as well

      if a class is "immutable", it is impossible to change the value of the existing variable
      if you want to make a class "immutable" do not create any "setter" method

   */

        Student std1 = new Student();
        System.out.println(std1.name);//Tom Hanks

        System.out.println(std1.getStId());//TH123

        std1.setDisease(null);//we changed the value as null, normally it was "Heart Disease"
        System.out.println(std1.getDisease()); //null

        System.out.println("**********");

        //updated variable is not the variable in the class, it is still the same
        // the changed one is of the object
        std1.setDisease("cancer");
        System.out.println(std1.getDisease());//cancer

        std1.setStdGpa(4.0);
        System.out.println(std1.getStdGpa());//4.0






    }
}












