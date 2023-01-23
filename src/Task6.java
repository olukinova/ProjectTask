import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number a:");
        int a = input.nextInt();
        System.out.println("Please enter number b:");
        int b = input.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
