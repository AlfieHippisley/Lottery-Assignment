import java.util.Scanner;

/**
 * 
 * @author Alfie Hippisley
 * 
 * @version 06/02/2018
 * 
 */

public class Menu {
	
	public void displayMenu() {
		// Display title & options
		System.out.println("\nLottery Assignment\n"+"---------------------------------------------------------");
		System.out.println("1 - Start Lottery\n" + "2 - How To Play\n" + "3 - Set Number Of Players\n" + "4 - Exit Program\n");

		// Take user input & process
		Scanner scanner1 = new Scanner(System.in);
		int userInput = scanner1.nextInt();
		
		switch(userInput) {
			// Case 1 (Run lottery)
			case 1:
				Lottery lottery1 = new Lottery();
				lottery1.runLottery();
			break;
			
			// Case 2 (How to play)
			case 2:
				System.out.println("\nHow to play\n"+"---------------------------------------------------------");
				System.out.println("When prompted, enter the numbers you would like to play");
				System.out.println("Your numbers will then be compared with the winning set.");
				System.out.println("You will then be informed if and what you have won.");
				System.out.println("\nBesure to check the max number of the current lottery");
			break;
			
			case 3:
				
			break;

			// Case 4 (Exit)
			case 4:
				System.out.println("\nProgram has now closed");
				System.exit(0);
			break;
			
			default:
				System.out.println("Invalid Entry, Try Again :");
			break;
		}
	}

	public static void main(String[] args) {
		// Menu On/Off
		boolean showMenu = true;
		
		// Create Menu object
		Menu menu1 = new Menu();
		while(showMenu) {
			menu1.displayMenu();
		}
	}
}
