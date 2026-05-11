package loops;

import java.util.*;

public class DoWhileExample {
	
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter n : ");
		int n = sc.nextInt();
	
		int i = 0;
		do {
			System.out.println("Hello "+(i+1));
			i++;			
		} while(i < n);
	}
}
