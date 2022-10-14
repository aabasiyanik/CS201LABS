package LAB1;

public class Pseudocode {
    public static void main(String[] args) {
        /*
         * To solve this type of question, the principal thing I should do is to create
         * four unique int variables.
         * Afterward I need to add all the variables outside the print command,
         * then divide the outcome by four to get the average of the four numbers.
         * Lastly, I will print out the outcome from the division.
         */
        int num_1 = 1;
        int num_2 = 2;
        int num_3 = 3;
        int num_4 = 4;
        double sum_of_nums = Double.valueOf(num_1 + num_2 + num_3 + num_4) / 4;
        System.out.println(sum_of_nums);
    }
}