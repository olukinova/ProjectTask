import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Please enter 5 numbers of the array:");
        array[0] = input.nextInt();
        array[1] = input.nextInt();
        array[2] = input.nextInt();
        array[3] = input.nextInt();
        array[4] = input.nextInt();
        System.out.println(Arrays.toString(array));

        int max = array[0];
        int min = array[1];

        for(int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Maximum number of the array is " + max);
        System.out.println("Minimum number of the array is " + min);
    }
}
