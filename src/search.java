import java.util.Random;

public class search {

    static Random random = new Random();

    static int targetNum;
    static int target = random.nextInt(100000) + 1;

    public static void main(String[] args) {
        System.out.println("The target number is " + target + "\n\n");


        System.out.println("The answer is " + findTarget());

    }


    static int findTarget() {
        while (targetNum != target) {
            if (targetNum < target) {
                targetNum++;
            } else {
                targetNum--;
            }
        }
        return targetNum;
    }
}
