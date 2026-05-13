package Functions;

import java.util.Scanner;

public class CircleCircumference {

	public static double calculateCircumference(double r) {
		if (r <= 0) {
			return 0;
		}
		
		double circum=2*Math.PI*r;
		return circum;
	
		
		
	}
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius : ");
		double r=sc.nextDouble();
		
	    double c=calculateCircumference(r);

	    System.out.println("Circumference is : "+c);
		
		sc.close();
	}
}
