package Functions;

import java.util.Scanner;

public class PowerFunction {

    public static int calculatePower(int x, int n) {

        int result = 1;

        for(int i = 1; i <= n; i++) {
            result = result * x;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x and n:");
        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println("x^n is : " + calculatePower(x, n));

        sc.close();
    }
}