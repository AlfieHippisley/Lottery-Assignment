import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Alfie Hippisley
 * 
 * @version 06/02/2018
 * 
 */

public class Lottery {
	// Sets
	MySet userNumberSet;
	MySet randomNumberSet;
	MySet intersectionSet;
	
	// Max number used in the lottery
	int maxNumber = 15;
	
	public Lottery(){
		userNumberSet = new MySet();
		randomNumberSet = new MySet();
		intersectionSet = new MySet();
	}
	
	public void runLottery() {
		getUserNumbers();
		generateLotteryNumbers();
		
		int matchingNumbers = intersectionSets();
		
		System.out.println("---------------------------------------------------------");
		System.out.println("The numbers you entered were :\n");
		userNumberSet.printSet();
		System.out.println("\nThe winning numbers of the lottery were :\n");
		randomNumberSet.printSet();
		System.out.println("---------------------------------------------------------");
		
		if(matchingNumbers == 3) {
			System.out.println("\nYou have won a total of £25!");
		}
		else if(matchingNumbers == 4) {
			System.out.println("\nYou have won a total of £100");
		}
		else if(matchingNumbers == 5) {
			System.out.println("\nYou have won a total of £1000");
		}
		else if(matchingNumbers == 6) {
			System.out.println("\nYou have won a total of £1,000,000");
		}
		else {
			System.out.println("\nYou have not won anything :(");
		}
		System.out.println("\n---------------------------------------------------------");
		System.out.println("Thanks for playing, you will now be returned to the menu.");
		System.out.println("---------------------------------------------------------");
	}

	public void getUserNumbers() {
		// Variable to store the user input
		int userInput;

		// Create scanner object
		Scanner scanner2 = new Scanner(System.in);
		
		// Get the max number from the user
		System.out.println("---------------------------------------------------------");
		System.out.println("What would you like the max number of this lottery to be? : ");
		userInput = scanner2.nextInt();
		
		// Number cant be below 6 as 6 numbers are needed to be entered
		while(userInput<6) {
			System.out.println("The max number must be above 6.\n");
			userInput = scanner2.nextInt();
		}
		
		// Set the max number
		maxNumber = userInput;
		
		// Display user instructions
		System.out.println("Please enter the numbers you would like to play, Max Number is " + maxNumber + " :");
		System.out.println("---------------------------------------------------------");
		
		// Get all numbers from user and add to set                                                                                         
		for(int index = 0; index <6; index++) {
			System.out.println("Enter Number :\n");
			userInput = scanner2.nextInt();
			
			boolean response = userNumberSet.isInSet(userInput);
			
			// If number has already been added to set, request new value
			while(response) {
				System.out.println("Invalid Entry, Please Try Again :");
				System.out.println("Enter Number :\n");
				userInput = scanner2.nextInt();
				response = userNumberSet.isInSet(userInput);
			}
			
			// If userInput is > maxNumber or < 0, request new value
			while(userInput <=0 || userInput > maxNumber) {
				System.out.println("Invalid Entry, Please Try Again :");
				System.out.println("Enter Number :\n");
				userInput = scanner2.nextInt();
			}
			userNumberSet.addToSet(userInput);
		}
	}
	
	public int getMaxNumber() {
		return maxNumber;
	}

	public void setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}

	public void generateLotteryNumbers() {	
		// Create instance of random object
		Random rand = new Random();
		
		// For each number needed
		for(int index = 0; index <6; index++) {
			// Generate Random Number
			int randomNumber = rand.nextInt(maxNumber) + 1;
			
			// Is this number already in the set?
			boolean response = randomNumberSet.isInSet(randomNumber);
			
			// If yes generate new number
			while(response == true) {
				randomNumber = rand.nextInt(maxNumber) + 1;
				response = randomNumberSet.isInSet(randomNumber);
			}
			// Add that number to the set
			randomNumberSet.addToSet(randomNumber);
		}
	}
	
	public int intersectionSets() {
		// Store user data in a different set to stop it being altered
		intersectionSet.intersection(userNumberSet);
	
		// Then perform the intersection with the data that
		intersectionSet.intersection(randomNumberSet);
		int matchingNumbers = userNumberSet.getCardinality();
		return matchingNumbers;
	}
}
