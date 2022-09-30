package LAB4;

import java.util.Scanner;

public class Question1 {

    public static double calcu() {

        Scanner input = new Scanner(System.in);
        System.out.println("firstNum");;
        double firstNum = input.nextDouble();
        System.out.println("secondNum");
        double secondNum = input.nextDouble();
        System.out.println("operator");
        String operator = input.next();

        double result = 0;
        switch (operator){
            case "+":
                result = firstNum+secondNum;
                break;
            case "-":
                result = firstNum-secondNum;
                break;
            case "*":
                result = firstNum*secondNum;
                break;
            case "/":
                result = firstNum/secondNum;
                break;
            default:
                System.out.println("input the correct operator");
                break;

        }

        return result;
    }
    public static void main(String[] args) {

        System.out.println(calcu());

    }
}
