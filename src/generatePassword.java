import java.util.*;

public class generatePassword {
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        generatePw();
    }


    static void generatePw() {
        int length = 0;
        boolean isNot = true;
        do {
            try {
                System.out.println("What's the length of your password?");
                length = input.nextInt();
                while (length%4 != 0){
                    System.out.println("Length of your password must be divisible by 4\n");
                    System.out.println("What's the length of your password?");
                    length = input.nextInt();
                }
                System.out.println();
                isNot = false;
            }catch (Exception exception){
                input.next();
                System.out.println("The length of the password must be an integer\n");
            }
        }while (isNot);

        char Min = 65;
        char Max = 90;
        char min = 97;
        char max = 122;

        char dash = 45;

        System.out.print("Your generated password is: ");
        for (int i = 0; i < length; i++) {
            int num1 = random.nextInt(Max - Min + 1) + Min;
            int num2 = random.nextInt(max - min + 1) + min;
            int num3 = random.nextInt(15) + 33;
            while (num3 == dash){
                num3 = random.nextInt(15) + 33;
            }

            int random1 = random.nextInt(5);
            if (random1 == 1 || random1 == 3) {
                System.out.print((char) num1);
            } else if (random1 == 0 || random1 == 4) {
                System.out.print((char) num2);
            } else System.out.print((char) num3);

            if (i + 1 == length){
                System.exit(0);
            }
            if (i >= 3 && (i + 1) % 4 == 0) {
                System.out.print(dash);
            }
        }


    }
}
