package Functions;

import java.util.Scanner;

public class NumberCountProgram {

    public static void countNumbers() {

        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zeros = 0;
        int choice;

        do {

            System.out.println("Enter number:");
            int num = sc.nextInt();

            if(num > 0) {
                positive++;
            }
            else if(num < 0) {
                negative++;
            }
            else {
                zeros++;
            }

            System.out.println("Press 1 to continue and 0 to stop:");
            choice = sc.nextInt();

        } while(choice == 1);

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zeros);

        sc.close();
    }

    public static void main(String[] args) {

        countNumbers();
    }
}