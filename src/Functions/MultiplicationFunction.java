package Functions;

import java.util.*;

public class MultiplicationFunction {
	
	public static int calculateProduct(int a,int b) {
		return a*b;
	}
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a :");
		int a =sc.nextInt();
		
		System.out.println("Enter b :");
		int b=sc.nextInt();
		
		System.out.println("Multiplication of "+a+" and "+b+" is : "+calculateProduct(a,b));;
	}
}
