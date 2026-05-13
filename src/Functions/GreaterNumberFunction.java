package Functions;

import java.util.Scanner;

public class GreaterNumberFunction {

	public static int findGreaterNum(int a,int b) {
		if (a > b) {
			return a;
		}
		else {
			return b;
		}
		
	}
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
	    int gre=findGreaterNum(a,b);
		
	    System.out.println("Greater is : "+gre);
		
		sc.close();
	}
}
