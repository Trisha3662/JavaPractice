package twodarrays;

import java.util.Scanner;

public class MatrixSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // input
        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number to search:");
        int s = sc.nextInt();

        // output
        boolean found = false;

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                if(s == numbers[i][j]) {

                    System.out.println("Found at: " + i + "," + j);
                    found = true;
                }
            }
        }

        if(!found) {
            System.out.println("Number not found");
        }

        sc.close();
    }
}