package LAB2;

public class Test {
    public static void main(String[] args) {
        Date cs201day = new Date(8, 21, 2022);
        System.out.println("CS201 first day is: " + cs201day);
        cs201day.setDate(cs201day.getMonth(), cs201day.getDay(),cs201day.getYear());
        System.out.println("Today is: " + cs201day);
        Date xmas1 = new Date(12, 25, 2022);
        System.out.println("Christmas Day this year is " +xmas1.toString());
        Date xmas2 = xmas1;
        System.out.println(xmas2);
        xmas1.setDate(xmas1.getMonth(), xmas1.getDay(), 2021);
        System.out.println(xmas2);

        /** Answer to Question 1.(a)
        The syntax is Date cs201day, it's coming from our Date.java class, because
        earlier we created our own method using constructors.
        The objects instantiated in Test.java are cs201day, xmas1, and xmas2 though
        there is no need for it.

        /* Answer to Question 2.(b)
        The methods are, Date, getMonth, getDay, getYear, toString. Arguments list,
         theDay, theMonth, theYear. The return value is the date(day, month, year) of the cs201day
         given by the user inside the Date method. It is used in Date.java class inside
         setDate method. setDate is being synchronized with getDay, get Month, and getYear methods.

         */
    }

}
