package LAB1;

import java.util.Scanner;

public class arithmetic_expressions {
    public static void main(String[] args) {
        // Convert your height in feet and inches into total inches
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height in feet and inches.");
        System.out.print("Feet: ");
        byte height_in_feet = input.nextByte();
        System.out.print("Inch: ");
        byte height_in_inch = input.nextByte();
        short total_height_in_inches = (short) ((height_in_feet * 12) + height_in_inch);
        System.out.println("In total your height is " + total_height_in_inches + " inches.");

        /*
         * Movie tickets are $11 for adults and half price for children. Calculate
         * the total cost for 3 adults and 2 children to watch a movie.
         */
        System.out.println("How many children tickets?");
        byte childeren_tickets = input.nextByte();
        System.out.println("How many adult tickets?");
        byte adult_tickets = input.nextByte();
        double total_cost = Double.valueOf(adult_tickets * 11) + (childeren_tickets * 5.5);
        System.out.println("Total cost: " + total_cost);

        /*
         * Your yearly salary is $47,500.00. You get paid monthly. The total
         * percentage of federal, FICA and state taxes they withhold is 29%.
         * Calculate your take home pay each month.
         */
        System.out.println("Enter your yearly salary below:");
        float yearly_salary = input.nextFloat();
        float after_taxes = (float) (yearly_salary * 0.71);
        float monthly_salary = (float) (after_taxes / 12);
        System.out.println("Your monthly earning after taxes are applied is " + monthly_salary);

        input.close();

    }
}
