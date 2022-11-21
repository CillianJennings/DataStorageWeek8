package ie.atu.week8;

import java.io.*;

public class DataStorageExercise {

    public static void main(String[] args) {

        File myFile = new File("MyFile.txt");
        System.out.println("\nMy file is located at " + myFile.getAbsolutePath());

        try{

            FileWriter outputFile = new FileWriter(myFile, true);
            outputFile.write("Adding another line to the file");
            outputFile.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
}