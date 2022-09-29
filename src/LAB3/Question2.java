package LAB3;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your time in 24-hour clock (hour:minute:second)");
        String userTime = input.nextLine();

        String[] split = userTime.split(":");

        int hour = Integer.parseInt(split[0]);
        int minute = Integer.parseInt(split[1]);
        int second = Integer.parseInt(split[2]);

        int newHour = 0;

        if (hour < 1 || hour > 24 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            System.out.println("Please enter your hour in 24-hour clock and make sure your credentials are right.");
            System.exit(0);
        }

        if (minute < 10 && second < 10) {
            if (hour > 12 && hour != 24) {
                newHour = hour - 12;
                System.out.println("The time in 12-hour clock is " + newHour + ":0" + minute + ":0" + second + " P.M.");
            } else if (hour < 13 && hour != 12) {
                newHour = hour;
                System.out.println("The time in 12-hour clock is " + newHour + ":0" + minute + ":0" + second + " A.M.");
            } else if (hour == 12) {
                System.out.println("The time in 12-hour clock is " + hour + ":0" + minute + ":0" + second + " P.M.");
            } else if (hour == 24) {
                newHour = hour - 12;
                System.out.println("The time in 12-hour clock is " + newHour + ":0" + minute + ":0" + second + " A.M.");
            }

        } else if (minute < 10 && second > 9) {
            if (hour > 12 && hour != 24) {
                newHour = hour - 12;
                System.out.println("The time in 12-hour clock is " + newHour + ":0" + minute + ":" + second + " P.M.");
            } else if (hour < 13 && hour != 12) {
                newHour = hour;
                System.out.println("The time in 12-hour clock is " + newHour + ":0" + minute + ":" + second + " A.M.");
            } else if (hour == 12) {
                System.out.println("The time in 12-hour clock is " + hour + ":0" + minute + ":" + second + " P.M.");
            } else if (hour == 24) {
                newHour = hour - 12;
                System.out.println("The time in 12-hour clock is " + newHour + ":0" + minute + ":" + second + " A.M.");
            }

        } else if (minute > 9 && second < 10) {
            if (hour > 12 && hour != 24) {
                newHour = hour - 12;
                System.out.println("The time in 12-hour clock is " + newHour + ":" + minute + ":0" + second + " P.M.");
            } else if (hour < 13 && hour != 12) {
                newHour = hour;
                System.out.println("The time in 12-hour clock is " + newHour + ":" + minute + ":0" + second + " A.M.");
            } else if (hour == 12) {
                System.out.println("The time in 12-hour clock is " + hour + ":" + minute + ":0" + second + " P.M.");
            } else if (hour == 24) {
                newHour = hour - 12;
                System.out.println("The time in 12-hour clock is " + newHour + ":" + minute + ":0" + second + " A.M.");
            }
        } else if (hour > 12 && hour != 24) {
            newHour = hour - 12;
            System.out.println("The time in 12-hour clock is " + newHour + ":" + minute + ":" + second + " P.M.");


        } else if (hour < 13 && hour != 12) {
            newHour = hour;
            System.out.println("The time in 12-hour clock is " + newHour + ":" + minute + ":" + second + " A.M.");

        } else if (hour == 12) {
            System.out.println("The time in 12-hour clock is " + hour + ":" + minute + ":" + second + " P.M.");
        } else if (hour == 24) {
            newHour = hour - 12;
            System.out.println("The time in 12-hour clock is " + newHour + ":" + minute + ":" + second + " A.M.");
        }

    }
}
