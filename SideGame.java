import java.util.Scanner;

public class SideGame {
	public static void numberGuessGame() {
		//See if player wants to play the Mini game
		GameLogic.clearConsole();
		GameLogic.printSeparator();
		System.out.println("Do you want to play the Number Guessing Game");
		System.out.println("(1) Yes\n(2) No");
		GameLogic.printSeparator();
		int input = GameLogic.checkInput("Enter The Number Of Choice: ", 2);
		if(input == 1) {
			//Creating Random Number
			GameLogic.clearConsole();
			int numRandom = (int)(Math.random() * 25 + 1);
			//Creating new scanner for number input check
			Scanner exitGame = new Scanner(System.in);
			int tries = 10;
			while(tries != 0) {
				GameLogic.clearConsole();
				GameLogic.printSeparator();
				System.out.println(" Can you guess what number I'm thinking rght now?"
									+ "\n For Fun? 1 - 25... Tries left: " + tries);
				GameLogic.printSeparator();
				int userGuess = GameLogic.checkInput("Enter The Number Of Choice: ", 25);
					
				//Checking if User enters Right number
				if(userGuess == numRandom) {
					GameLogic.clearConsole();
					GameLogic.printHeading("You're correct!!!. My number was " + numRandom);
					GameLogic.anythingToContiune();
					break;
				}
				//Checking if User enter Too high of numer
				else if(userGuess > numRandom) {
					GameLogic.clearConsole();
					GameLogic.printHeading("You're too high");
					tries--;
				}
				//Checking if User enter Too low of number
				else {
					GameLogic.clearConsole();
					GameLogic.printHeading("You're too low");
					tries--;
				}
				
				//Ask user if they want to exit game
				GameLogic.printSeparator();
				System.out.println("Exit Number Game? \nEnter: 'Yes'");
				GameLogic.printSeparator();
				String exit = exitGame.nextLine();
				if(exit.equals("Yes")) {
					GameLogic.clearConsole();
					GameLogic.printHeading("Good Bye");
					GameLogic.anythingToContiune();
					tries = 0;
					break;
				}
				else{
					GameLogic.clearConsole();
					GameLogic.printHeading("Keep Playing");
					GameLogic.anythingToContiune();
				}
				
			}
		}
		else if(input == 2) {
			GameLogic.clearConsole();
			GameLogic.printHeading("Good Bye");
			GameLogic.anythingToContiune();
		}
	}
}