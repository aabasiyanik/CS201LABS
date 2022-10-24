package LAB6;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to see the ");
        int userInput = input.nextInt();
        input.close();

        /* Using Recursion
        for (int i = 0; i < userInput; i++) {
            if (i==0){
                System.out.println((i + 1) + "st Fibonacci number is: " + F(i));
            } else if (i==1) {
                System.out.println((i + 1) + "nd Fibonacci number is: " + F(i));
            } else if (i==2) {
                System.out.println((i + 1) + "rd Fibonacci number is: " + F(i));
            }else System.out.println((i + 1) + "th Fibonacci number is: " + F(i));
    }
         */


        /* Using Iteration
        F(userInput);
         */


    }



    /* Using Recursion
    static int F(int x) {
        if (x <= 1) {
            return x;
        } else return F(x - 1) + F(x - 2);
    }
    */



    /* Using Iteration
    static void F(int x){
        long first = 0, second = 1;
        for (int i = 0; i < x; i++) {
            if (i==0){
                System.out.println((i + 1) + "st Fibonacci number is: " + first);
            } else if (i==1) {
                System.out.println((i + 1) + "nd Fibonacci number is: " + first);
            } else if (i==2) {
                System.out.println((i + 1) + "rd Fibonacci number is: " + first);
            }else System.out.println((i + 1) + "th Fibonacci number is: " + first);

            long num = first + second;
            first = second;
            second = num;
        }
    }
    */


}