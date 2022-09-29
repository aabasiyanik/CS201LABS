package LAB4;

public class Question3 {
    public static void main(String[] args) {

        int num = 7;
        int lim = 0;

        while (lim<200/7) {

            System.out.print(num + " ");
            num = num+7;
            lim++;
            if (lim%4 ==0) System.out.println();

        }

    }
}
