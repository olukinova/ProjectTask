import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = input.nextInt();

        boolean isPrime = true;
        for(int i = 2; i <= number/2; i++) {
            if(number%i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println("The number " + number + " is prime");
        } else {
            System.out.println("The number " + number + " is not prime");


        }
    }
}
