package LAB2;

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int theDay, int theMonth, int theYear) {
        day = theDay;
        month = theMonth;
        year = theYear;

    }

    public int getMonth() {
        return month;

    }

    public int getDay() {
        return day;

    }

    public int getYear() {
        return year;

    }

    public void setDate(int theMonth, int theDay, int theYear) {
        int[] validDays = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (theMonth >= 1 && theMonth <= 12) {
            month = theMonth;
        } else {
            month = 0;
        }
        if (theDay >= 1 && theDay <= validDays[month]) {
            day = theDay;
        } else {
            day = 0;
        }
        if (theYear >= 2000) {
            year = theYear;
        } else {
            year = 0;
        }
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
