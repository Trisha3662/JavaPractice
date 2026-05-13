package Functions;

import java.util.*;

public class FactorialFunction {

    public static int calculateFactorial(int n) {

        int factorial = 1;

        for(int i = n; i > 1; i--) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        if(n < 0) {
            System.out.println("Invalid Number.");
        } else {
            System.out.println("Factorial of " + n + " is: " + calculateFactorial(n));
        }

        sc.close();
    }
}