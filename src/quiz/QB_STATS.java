package quiz;

import java.util.Scanner;

public class QB_STATS {

	static Scanner user_input = new Scanner(System.in);
	
	public static void main(String[] args){
		
		
		float yards;
		float completions;
		float attempts;
		int intercepted;
		int TD;
		
		user_input = new Scanner(System.in);
		
		System.out.print("Number of yards: ");
		yards= user_input.nextFloat();
		
		System.out.print("Completions of QB: ");
		completions=user_input.nextFloat();
		
		System.out.print("Number of attempts: ");
		attempts=user_input.nextFloat();
		
		System.out.print("Number of intercepts: ");
		intercepted= user_input.nextInt();
		
		System.out.print("Number of TDs: ");
		TD=user_input.nextInt();
		
		float A;
		A = (float) ((((completions/attempts)*100)-30)*.05);
		System.out.println("Completion ratings is: "+ A);
		
		float B;
		B = (float) (((yards/attempts)-3)*.25);
		System.out.println("Yards per attempts: " + B);
		
		float C;
		C = (float) (((TD/attempts)*100)*.2);
		System.out.println("TD per attempts: " + C);
		
		float D;
		D= (float) (((intercepted/attempts)*100)*.25);
		System.out.println("interceped per attempts: " + D);
		
		float Rating;
		Rating = ((A+B+C+D)/6)*100;
		System.out.println("QB rating is: "+Rating);
		
		
		
		
				
		
	}
	
	
}
