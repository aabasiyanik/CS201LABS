package LAB6;

import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfDisks = 0;
        int totalMoves = 0;
        boolean isNot = true;

        do {
            try {
                System.out.println("How many disks you want there to be?");
                numOfDisks = input.nextInt();
                while (numOfDisks < 1) {
                    System.out.println("Your number must be greater than or equal to 1\n\nHow many disks you want there to be?");
                    numOfDisks = input.nextInt();
                }
                totalMoves = (int) (Math.pow(2, numOfDisks) - 1);
                isNot = false;
            } catch (Exception exception) {
                input.next();
                System.out.println("Please try again.\n");
            }
        } while (isNot);

        Steps(numOfDisks, 'A', 'B', 'C');

        System.out.println("In total there will be a minimum of " + totalMoves + " moves.");
    }

    static void Steps(int numOfDisks, char startRod, char targetRod, char carrierRod) {
        if (numOfDisks == 1) {
            System.out.println("Move disk 1 from rod " + startRod + " to rod " + targetRod);
        } else {
            Steps(numOfDisks - 1, startRod, carrierRod, targetRod);
            System.out.println("Move disk " + numOfDisks + " from rod " + startRod + " to rod " + targetRod);
            Steps(numOfDisks - 1, carrierRod, targetRod, startRod);
        }
    }
}
