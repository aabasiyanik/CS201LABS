package LAB3;

public class Question1 {
    public static void main(String[] args) {

//        11:59:59 P.M. 9/26/2022

        String myCurrentTime = "10:20:20:P.M";
        String myCurrentDate = "9/23/2022";

        String[] time = myCurrentTime.split(":");
        String[] date = myCurrentDate.split("/");

        int hour = Integer.parseInt(time[0]);
        int minute = Integer.parseInt(time[1]);
        int second = Integer.parseInt(time[2]);

        int month = Integer.parseInt(date[0]);
        int day = Integer.parseInt(date[1]);
        int year = Integer.parseInt(date[2]);

        if (hour < 0 || hour > 12 || minute < 0 || minute > 59 || second < 0 || second > 59 || month < 0 || month > 12 || day < 0 || day > 31 || year < 0) {
            System.out.println("Please enter your hour in 12-hour clock and make sure your credentials are right.");
            System.exit(0);
        }
        if (month > 9 || day > 26 || year > 2022) {
            System.out.println("You missed the class!");
            System.exit(0);
        }

        String AMvsPM = time[3];

        int newDay;

        newDay = 26 - day;


        int Hour = 0, newMinute = 0, newSecond = 0;

        if (AMvsPM.contains("P")) {
            if (hour <= 11) {
                Hour = 11 - hour;
            } else if (hour == 12) {
                Hour = 11;
            }
        } else if (AMvsPM.contains("A")) {
            if (hour <= 11) {
                Hour = 11 - hour + 12;
            } else if (hour == 12) {
                Hour = 23;
            }
        }
        if (minute <= 59) {
            newMinute = 59 - minute;
        }
        if (second <= 59) {
            newSecond = 59 - second;
        }

        int newHour = Hour + (24 * newDay);

        System.out.println("You have " + newHour + " hours, " + newMinute + " minutes, and " + newSecond + " seconds left until the deadline.");


    }
}
