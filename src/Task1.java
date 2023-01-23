import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = new int[6];
        System.out.println("Please enter 6 numbers:");
        arr[0]= input.nextInt();
        arr[1]= input.nextInt();
        arr[2]= input.nextInt();
        arr[3]= input.nextInt();
        arr[4]= input.nextInt();
        arr[5]= input.nextInt();

        int sum = 0;
        for (int num: arr) {
            sum += num;
        }
        System.out.println(sum);
    }
}
