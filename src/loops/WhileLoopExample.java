package loops;

import java.util.*;

public class WhileLoopExample {
	
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter n : ");
		int n = sc.nextInt();
	
		int i = 0;
		while(i < n) {
			System.out.println("Hello "+(i+1));
			i++;
		}
	}
}
