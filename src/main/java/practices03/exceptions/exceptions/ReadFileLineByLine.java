package practices03.exceptions.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

    public static void main(String[] args) {

         readFilelineByLine();

    }

    public static void readFilelineByLine()  {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src\\main\\java\\practices03\\exceptions\\File.txt"));

            String line = reader.readLine();//readLine() method reads line by line

            while (line != null){
                System.out.println(line);
                line = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("there is an issue about the path or about the file  - " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



}
