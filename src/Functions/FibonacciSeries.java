package Functions;

import java.util.Scanner;

public class FibonacciSeries {

    public static void printFibonacci(int n) {
    	
        int f = 0;
        int s = 1;
        
        System.out.print(f + " " + s + " ");
        for(int i = 3; i <= n; i++) {
            int t = f + s;
            System.out.print(t + " ");
            f = s;
            s = t;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        printFibonacci(n);
        sc.close();
    }
}