package Functions;

import java.util.*;

public class AverageFunction {

	public static double calculateAverage(int a,int b,int c) {
		int sum=a+b+c;
		double avg=sum/3.0;
		return avg;
		
	}
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a , b and c :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		double avg=calculateAverage(a,b,c);
		
		System.out.println("Average is : "+avg);
		
		sc.close();
	}
}
