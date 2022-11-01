package LAB7;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your pikachu name:");
        String pikachu1name = input.nextLine();
        System.out.println("Enter your pikachu gender:");
        char pikachu1gender = input.next().charAt(0);
        System.out.println("Enter your pikachu age:");
        int pikachu1age = input.nextInt();
        input.nextLine();

        System.out.println("Enter your pikachu name:");
        String pikachu2name = input.nextLine();
        System.out.println("Enter your pikachu gender:");
        char pikachu2gender = input.next().charAt(0);
        System.out.println("Enter your pikachu age:");
        int pikachu2age = input.nextInt();
        input.nextLine();

        System.out.println("Enter your pikachu name:");
        String pikachu3name = input.nextLine();
        System.out.println("Enter your pikachu gender:");
        char pikachu3gender = input.next().charAt(0);
        System.out.println("Enter your pikachu age:");
        int pikachu3age = input.nextInt();
        input.nextLine();

        myPika pika1 = new myPika(pikachu1name, pikachu1gender, pikachu1age);
        myPika pika2 = new myPika(pikachu2name, pikachu2gender, pikachu2age);
        myPika pika3 = new myPika(pikachu3name, pikachu3gender, pikachu3age);
        myPika[] pikas = {pika1, pika2, pika3};

        System.out.println(pikas[2]);

    }
}

class myPika {

    private String name;
    private char gender;
    private int age;

    public myPika(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String toString() {
        return "The pikachu information in index 2 is My pokemon " + name + " is " + age + " years old";
    }
}