import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
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

        // finding largest number of the array
        int largest = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > largest) {
                largest = array[i];
            }
        }

        // finding second largest number in the array

        int secondLargest = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > secondLargest && array[i] < largest) {
                secondLargest = array[i];
            }
        }
        System.out.println("Second largest number of the array is " + secondLargest);

    }
}
