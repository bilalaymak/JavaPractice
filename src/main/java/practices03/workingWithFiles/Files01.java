package practices03.workingWithFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files01 {
    public static void main(String[] args) {

          createFile();
        System.out.println("*****************");
        getFileInfo();
        System.out.println("*****************");
        readFileWithScanner();


    }

    public static void createFile(){
        File file = new File("src\\main\\java\\practices03\\workingWithFiles\\Students.txt");
        try {
            if(file.createNewFile()){
                System.out.println("File created");
            }else{
                System.out.println("File already exists");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void getFileInfo(){
        File file = new File("src\\main\\java\\practices03\\workingWithFiles\\Students.txt");
        try {
            if(file.exists()){
                System.out.println("File exists : " + file.getName());//File exists : Students.txt
                System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
                System.out.println("file.length() (byte) = " + file.length());//58
                //file.length() Returns:
                //The length, in bytes, of the file denoted by this abstract pathname
                System.out.println("file.canRead() = " + file.canRead());//true
                System.out.println("file.canWrite() = " + file.canWrite());//true

            }else{
                System.out.println("File does not exists");
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }


    public static void readFileWithScanner() {
        File file = new File("src\\main\\java\\practices03\\workingWithFiles\\Students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNext()){
               String line =  reader.nextLine();
                System.out.println(line);
            }
             reader.close();

        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }



















}
