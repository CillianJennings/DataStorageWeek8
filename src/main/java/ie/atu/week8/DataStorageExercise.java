package ie.atu.week8;

import java.io.*;

public class DataStorageExercise {

    public static void main(String[] args) {

        File myFile = new File("MyFile.txt");
        System.out.println("\nMy file is located at " + myFile.getAbsolutePath());

        try{
            FileWriter myWriter = new FileWriter(myFile, true);
            PrintWriter myPrinter = new PrintWriter(myWriter);
            myPrinter.println("Adding a final line to the file");
            myPrinter.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
}