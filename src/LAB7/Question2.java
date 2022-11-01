package LAB7;

import java.util.*;
import java.io.*;

public class Question2 {
    static int[] data = new int[1000000];
    static final int target = 992800;

    public static void main(String[] args) {
        fileReader();
        System.out.println(binarySearch());
    }


    static void fileReader() {
        try {
            File file = new File("C:\\Users\\SamiL\\IdeaProjects\\CS201LABS\\src\\LAB7\\SortedData.txt");
            Scanner input = new Scanner(file);
            int counter = 0;
            while (input.hasNextInt()) {
                data[counter] = input.nextInt();
                counter++;
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }

    static int binarySearch() {
        int lowerLimit = 0;
        int upperLimit = data.length - 1;
        while (lowerLimit <= upperLimit) {
            int midPoint = (lowerLimit + upperLimit) / 2;
            if (data[midPoint] == target) {
                return midPoint;
            } else if (data[midPoint] < target) {
                lowerLimit = data[midPoint] + 1;
            } else upperLimit = data[midPoint] - 1;
        }

        //If there is no such value
        return -1;
    }
}
