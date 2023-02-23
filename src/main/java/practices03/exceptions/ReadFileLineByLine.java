package practices03.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileLineByLine {

    public static void main(String[] args) {



    }

    public static void readFilelineByLine() throws FileNotFoundException {

        BufferedReader reader = new BufferedReader(new FileReader("src\\main\\java\\practices03\\exceptions\\File.txt"));

    }



}
