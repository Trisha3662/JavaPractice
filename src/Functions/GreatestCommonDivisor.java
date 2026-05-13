package Functions;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static int calculateGCD(int a, int b) {

       while(b != 0) {
    	   int temp = b;
    	   b = a % b ;
    	   a = temp;
       }

        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = calculateGCD(a, b);

        System.out.println("GCD is: " + gcd);

        sc.close();
    }
}