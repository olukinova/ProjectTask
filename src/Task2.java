import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] countries = new String[3];
        System.out.println("Please enter 3 countries");
        countries[0] = input.next();
        countries[1] = input.next();
        countries[2] = input.next();
        String[] capitals = new String[3];
        System.out.println("Please enter capitals:");
        capitals[0]= input.next();
        capitals[1] = input.next();
        capitals[2] = input.next();

        for (int i = 0; i < countries.length; i++) {
            System.out.println("The capital of " + countries[i] + " is " + capitals[i]);
        }
    }
}

