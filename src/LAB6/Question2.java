package LAB6;

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        int n = 0;
        boolean isNot = true;
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("How many hundreds pounds of bananas do you have?");
                n = input.nextInt();
                while (n<1){
                    System.out.println("Snorlax is hungry, give him some bananas!");
                    n = input.nextInt();
                }
                isNot = false;
            }catch (Exception exception){
                input.next();
                System.out.println("Please try again\n");
            }
        }while(isNot);
        System.out.println("Snorlax can finish them in " + numOfWays(n) + " ways.");
    }

    static long numOfWays(int n) {
        long a = 1, b = 0, c = 0;
        long carrier;
        for (int i = 0; i < n; i++) {
            carrier = a;
            a = a + b + c;
            c = b;
            b = carrier;
        }
        return a;
    }
}
