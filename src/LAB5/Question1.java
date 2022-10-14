package LAB5;

import java.util.*;

/*
 *This problem requires us to get the prime numbers between 1-150(1 is not a prime number)
 *Meaning of prime number is that it cannot be divisible by other numbers but itself and 1.
 *We can create a method within the class to get the sum of the prime numbers and inside the method we can
 * calculate how many times we generated a prime number and store it in an int variable to get the average and
 * the variant. We will get the numbers from user by letting them enter a two int parameters inside the method.
 * These parameters are going to be int, and they will represent lower bound and upper bound of our range.
 */

public class Question1 {

    static boolean CalculateAverage(int upperB) {
        //upperB cannot be lower than 2, because there is no prime numbers below 2.
        if (upperB < 2) return false;

        // This for loop will test if our input is prime, 'i' starts from 2 because 2 is the smallest prime number
        for (int i = 2; i < upperB; i++) {
            // This if statement will return false only if upperB is divisible by b which is not 1 and not the upperB itself.
            if (upperB % i == 0) return false;
        }
        // If the if statement is false, then we will return true which will have effect on our main method.
        return true;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Creating a count and sum variable to get the sum of all the prime numbers between our given range and count to see how many times
        // we made addition to divide the sum by count to get the average.
        int count = 0, sum = 0;
        System.out.println("Please enter the Upper Bound of the range. Lower Bound starts from 1.");
        int UpperB = input.nextInt();

        // I am making an array to store all the prime numbers in the given range, to get the size of the array I will
        // make the same for loop I did on line 56.
        int setSizeOfTheArray = 0;
        for (int i = 1; i < UpperB; i++) {
            if (CalculateAverage(i)) {
                setSizeOfTheArray++;
            }
        }
        double[] varianceData = new double[setSizeOfTheArray];

        while (UpperB < 2) {
            System.out.println("Upper Bound cannot be lower than 2, please enter an integer that is greater than 2");
            UpperB = input.nextInt();
        }

        // In this for loop 'i' is starting from because 1 is our lower limit, if you want different lower bound you may make some change.
        // 'i' is less than or equal to UpperB because, if our input is also a prime number we do not want to exclude it from our total.
        // Our loop will execute until 'i' is greater than our given Upper Bound.
        for (int i = 1; i <= UpperB; i++) {
            // This if statement will take the value 'i' to the "CalculateAverage" method and assign it to upperB,
            // if it returns true, then we will add value 'i' to sum and add 1 to count. This if statement will be
            // executed until the for loop ends.
            if (CalculateAverage(i)) {
                sum += i;
                varianceData[count] = i;
                count++;
            }
        }
        // Simple arithmetic expression, we are converting sum to double before the division because the average may not be an Integer.
        // Also, to visualize the result better, I wanted to round the average to the nearest 2 decimal point.
        double average = (double) (sum) / count;
        System.out.println("The average of the prime numbers in the given range is: " + Math.round(average * 100.0) / 100.0);

        //To calculate the variance we will have to take the difference of the first number in our varianceData array and
        // divided by our mean which is sum / count, then square it. We have to store our result in another double variable,
        double varianceTotal = 0;

        // I will make a for each loop, so we can add all the squared numbers in our varianceTotal variable.
        for (double Data : varianceData) {
            varianceTotal += Math.pow(Data - average, 2);
        }
        // The formula says n - 1 where 'n' is the size of the sample, in this case our n is the length of the varianceData array.
        varianceTotal /= varianceData.length - 1;
        System.out.println("The variance of the prime numbers in the given range is: " + Math.round(varianceTotal * 100.0) / 100.0);
    }
}