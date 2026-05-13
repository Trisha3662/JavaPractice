package Functions;

import java.util.Scanner;

public class VotingEligibility{

	public static void checkVotingEligibility(int a) {
		if(a >= 18) {
			System.out.println("The person is eligible to vote.");
			
		}
		else {
			System.out.println("The person is not eligible to vote.");
		
		}
		return;
		
	}
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age : ");
		int a=sc.nextInt();

		
		checkVotingEligibility(a);
		
		sc.close();
	}
}
