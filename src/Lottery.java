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
	
	MySet userNumberSet;
	MySet randomNumberSet;
	
	// Max number used in the lottery
	int maxNumber = 15;
	
	public Lottery(){
		userNumberSet = new MySet();
		randomNumberSet = new MySet();
	}
	
	public void runLottery() {
		getUserNumbers();
		generateLotteryNumbers();
		
		int matchingNumbers = intersectionSets();
		
		if(matchingNumbers == 3) {
			System.out.println("You have won a total of £25!");
		}
		else if(matchingNumbers == 4) {
			System.out.println("You have won a total of £100");
		}
		else if(matchingNumbers == 5) {
			System.out.println("You have won a total of £1000");
		}
		else if(matchingNumbers == 6) {
			System.out.println("You have won a total of £1,000,000");
		}
		else {
			System.out.println("You have not won anything :(");
		}
	}

	public void getUserNumbers() {
		// Variable to store the user input
		int userInput;
		
		// Display user instructions
		System.out.println("---------------------------------------------------------");
		System.out.println("Please enter the numbers you would like to play -");
		System.out.println("---------------------------------------------------------");
		// Get the users choice of numbers
		Scanner scanner2 = new Scanner(System.in);
		
		// Get all numbers from user and add to set                                                                                         
		for(int index = 0; index <6; index++) {
			System.out.println("Enter Number :\n");
			userInput = scanner2.nextInt();
			while(userInput <=0 || userInput >= maxNumber) {
				System.out.println("Invalid Entry, Please Try Again :");
				System.out.println("Enter Number :\n");
				userInput = scanner2.nextInt();
			}
			userNumberSet.addToSet(userInput);
		}
		System.out.println("User Number Set :");
		userNumberSet.printSet();
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
		System.out.println("Random Number Set :");
		randomNumberSet.printSet();
	}
	
	public int intersectionSets() {
		userNumberSet.intersection(randomNumberSet);
		int matchingNumbers = userNumberSet.getCardinality();
		System.out.println(matchingNumbers);
		return matchingNumbers;
	}
}
