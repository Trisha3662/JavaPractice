package Functions;

import java.util.Scanner;

public class OddNumbersSum {

	public static int calculateOddSum(int n) {
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			if (i % 2 !=0) {
				sum+=i;
			}
		}
		return sum;
		
	}
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		
	    int summ=calculateOddSum(n);
		
	    System.out.println("sum odd numbers is : "+summ);
		
		sc.close();
	}
}
