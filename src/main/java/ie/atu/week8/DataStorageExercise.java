package ie.atu.week8;

import java.io.*;
import java.util.Scanner;

public class DataStorageExercise {

    public static void main(String[] args) {

        File myFile = new File("MyFile.txt");
        System.out.println("\nMy file is located at " + myFile.getAbsolutePath());
        Scanner inputFile = null;

        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a file name: ");
            String filename = input.nextLine();
            inputFile = new Scanner (new File(filename));

            FileWriter myWriter = new FileWriter(myFile, true);
            PrintWriter myPrinter = new PrintWriter(myWriter);
            myPrinter.println("Adding another final line to the file");
            myPrinter.close();

        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        while(inputFile.hasNext()){
            String str = inputFile.nextLine();
            System.out.println(str);
        }
    }
}