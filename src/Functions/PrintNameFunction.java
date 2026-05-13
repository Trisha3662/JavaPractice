package Functions;

import java.util.*;

public class PrintNameFunction{
	
	public static void PrintMyName(String name) {
		System.out.println("Your name is : "+name);
		return;
	}
	public static void main(String []args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name :");
		String name=sc.next();
		
		PrintMyName(name); //call 
	}
}