package LAB5;

import java.util.*;

public class Question2 {

    static Scanner input = new Scanner(System.in);
    static Random random = new Random();
    static int bombNum = random.nextInt(100) + 1;
    static int player1, player2;
    static int lowerRange = 1, upperRange = 100;

    public static void main(String[] args) {

        while (player1 != bombNum || player2 != bombNum) {
            System.out.println("Player1 turn, guess a number");
            askUser1();
            while (player1 > 100 || player1 < 1) {
                System.out.println("Please guess a valid number, the range should be 1 to 100");
                askUser1();
            }
            if (player1 == bombNum) {
                System.out.println("Boomb, Player2 wins!!");
                System.exit(0);
            } else if (bombNum > player1) {
                if (lowerRange > player1) {
                    System.out.println("Too low, the range is " + lowerRange + " to " + upperRange);
                } else {
                    lowerRange = player1 + 1;
                    System.out.println("Too low, now the range is " + lowerRange + " to " + upperRange);
                }
            } else {
                if (upperRange < player1) {
                    System.out.println("Too low, the range is " + lowerRange + " to " + upperRange);
                } else {
                    upperRange = player1 - 1;
                    System.out.println("Too high, now the range is " + lowerRange + " to " + upperRange);
                }
            }
            System.out.println("Player2 turn, guess a number");
            askUser2();
            while (player2 > 100 || player2 < 1) {
                System.out.println("Please guess a valid number, the range should be 1 to 100");
                askUser2();
            }
            if (player2 == bombNum) {
                System.out.println("Boomb, Player1 wins!!");
                System.exit(0);
            } else if (bombNum > player2) {
                if (lowerRange > player2) {
                    System.out.println("Too low, the range is " + lowerRange + " to " + upperRange);
                } else {
                    lowerRange = player2 + 1;
                    System.out.println("Too low, now the range is " + lowerRange + " to " + upperRange);
                }
            } else {
                if (upperRange < player2) {
                    System.out.println("Too low, the range is " + lowerRange + " to " + upperRange);
                } else {
                    upperRange = player2 - 1;
                    System.out.println("Too high, now the range is " + lowerRange + " to " + upperRange);
                }
            }

        }

    }

    static void askUser1() {

        try {
            player1 = input.nextInt();
        } catch (Exception exception) {
            input.next();
            System.out.println("Please enter an integer");
            askUser1();
        }
    }

    static void askUser2() {

        try {
            player2 = input.nextInt();
        } catch (Exception exception) {
            input.next();
            System.out.println("Please enter an integer");
            askUser2();
        }
    }

}
