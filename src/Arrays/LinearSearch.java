package Arrays;

import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		
		int size=sc.nextInt();
		int numbers[] = new int[size];
		//input
		System.out.println("Give the array elements : ");
		for(int i=0; i<size; i++) {
			numbers[i] = sc.nextInt();
		}
		System.out.println("Enter the number to search : ");
		int n = sc.nextInt();
		boolean found = false;

		for(int i = 0; i < size; i++) {

		    if(numbers[i] == n) {

		        System.out.println("found at Index  " + i);
		        found = true;
		        break;
		    }
		}

		if(!found) {
		    System.out.println("Number not found.");
		}
		
	}
}
