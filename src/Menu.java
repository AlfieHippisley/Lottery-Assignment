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
		System.out.println("1 - Start Lottery\n" + "2 - How To Play\n" + "3 - Settings\n"+ "4 - Exit Program\n");

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
			break;
			
			case 3:
				System.out.println("\nSettings\n"+"---------------------------------------------------------");
			break;
			// Case 4 (Exit)
			case 4:
				System.exit(0);
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
