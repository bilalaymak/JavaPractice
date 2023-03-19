package step02.encapsulation.student01;

public class Student {

    public String name = "Tom Hanks";
    private String stId = "TH123";
    private double stdGpa = 3.8;

    private String disease = "Heart Disease";

    private boolean successful = false;


    //getter methods
    // in getter methods to capsulation, the return type of variables and getter method must be the same
    // ==>> int -int, boolean-boolean, String-String !!!
    public String getStId() {//getter method to read private variable
        return stId;
    }

    public double getStdGpa() {//getter method
        return stdGpa;
    }

    public String getDisease(){//getter method
        return disease;
    }

    public boolean isSuccessful() {//getter method
        //if data type is "boolean", get method name starts with "is"
        return successful;
    }


    // setter methods
    public void setDisease(String disease) {//setter method to update private variable
        // return type is "void" in setter. it must be void!!!
        //return type(String) is in parameter
        this.disease = disease;
    }

    public void setStdGpa(double stdGpa) {//setter method
        this.stdGpa = stdGpa;
    }

    //even if the data type is boolean we use "set" at the beginning of the name
    public void setSuccessful(boolean successful) {
        this.successful = successful; //"this" keyword is important here, do not forget!!
    }
}
