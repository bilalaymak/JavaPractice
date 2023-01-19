package practices01.encapsulation;

public class Student {

    public String name = "Tom Hanks";
    private String stId = "TH123";
    private double stdGpa = 3.8;

    private String disease = "Heart Disease";

    private boolean successful = false;

    public String getStId() {//getter method to read private variable
        return stId;
    }

    public double getStdGpa() {//getter method
        return stdGpa;
    }

    public String getDisease(){//get method
        return disease;
    }

    public boolean isSuccessful() {//if data type os "boolean", get method name starts with "is"
        return successful;
    }

    public void setDisease(String disease) {//setter method to update private variable
        // return type is "void" in setter
        //return type(String) is in parameter
        this.disease = disease;
    }

    public void setStdGpa(double stdGpa) {//setter method
        this.stdGpa = stdGpa;
    }

    //even the data type is boolean we use "set" at the beginning of the name
    public void setSuccessful(boolean successful) {
        this.successful = successful; //this keyword is important here, do not forget!!
    }
}
