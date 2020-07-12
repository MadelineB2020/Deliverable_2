import java.util.Scanner;
import java.util.Random; 

public class Head_or_Tails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String headsOrTails;
		double numberOfFlips;
		String headsOrTailsGuess;
		double theFlip;
		double correctCount;
		int headsCount = 0;
		int tailsCount = 0;
		
	
	Scanner scan = new Scanner(System.in);
		
	System.out.println("Wanna play a game? Guess which will have more, heads or tails!");
		headsOrTailsGuess = scan.next();
		
	System.out.println("Got it. How many times would you like the coin to be flipped?");
		numberOfFlips = scan.nextInt();
		
		
		
	Random random = new Random();
	
	
	for (int count = 0; count < numberOfFlips; count++) {
		theFlip = Math.random();
	
		
		if (theFlip < .5)
			headsOrTails = ("Heads");
		else 
			headsOrTails = ("Tails");
		
		if (headsOrTails.equals("Heads"))
			headsCount++;
		else 
			tailsCount++;
		
		System.out.println(headsOrTails); 	
		
		
		
	}{
		if (headsOrTailsGuess.equals("Heads")) 
			correctCount = ((headsCount / numberOfFlips) * 100); 
		else 
		correctCount = ((tailsCount / numberOfFlips) * 100); 
	
		
		if (headsOrTailsGuess.equals("Heads")) 
			System.out.println("Your guess was " + headsOrTailsGuess + ". That answer came up " + headsCount +  " times. That's " + correctCount + "%!");
		else 
			System.out.println("Your guess was " + headsOrTailsGuess + ". That answer came up " + tailsCount +  " times. That's " + correctCount + "%!");
		
	}
			}	
		}



