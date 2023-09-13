package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
		
	System.out.println("What is the starting amount?"); 
	int startAmount = in.nextInt(); 
	
	System.out.println("What is the win chance?");
	double winChance = in.nextDouble(); 
	
	System.out.println("What is the win limit?"); 
	int winLimit = in.nextInt(); 
	
	System.out.println("How many days will you play?"); 
	int totalSimulations = in.nextInt(); 
	
	while (startAmount < winLimit && startAmount > 0)
	
	{
		
	 if (Math.random() < winChance) {
	 startAmount = startAmount + 1; 
	 }
	 else {
	 startAmount = startAmount - 1; 
	 } 
	}
	
	if (startAmount <= 0) {
	System.out.println("Ruin!"); 
	totalSimulations ++; 
	}
	else 
	{
	System.out.println("Win!");
	totalSimulations ++; 
	 }
	
	System.out.println("Day: " + totalSimulations);
	}
		
}