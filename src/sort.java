import java.util.*;

public class sort {
    public static void main(String[] args) {
        int arrayElements = 10;
        Random random = new Random();

        int[] arr = new int[arrayElements];

        for (int i = 0; i < arrayElements; i++) {
            arr[i] = random.nextInt(100 ) + 1;
            System.out.println((i+1) + ": " + arr[i]);
        }

        System.out.println("Before sorting: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
