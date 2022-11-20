package storingData;

import java.io.*;

public class DataStorageExercise {

    public static void main(String[] args) {

        File myFile = new File("MyFile.txt");
        System.out.println("My file is located at " + myFile.getAbsolutePath());
    }
}