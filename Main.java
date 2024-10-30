/* Group Name: Weronies
 * Name 1: Slok Patel 
 * Name 2: Joseph Acosta
 * Name 3: Miguel Campos
 * Name 4: Steven Yang                  
 * Your Course Number (CS2011) 
 * Your Section Numbers: 01 & 02 & 04 
 * Description: The purpose of this was about making Final Game.
 * Other Comments: 
 */
 
 public class Main {
	public static void main(String[] args) {
		//Using If statement to check the args are matching so it can run the method 
		if(args.length != 0 && args[0].equals("-help")) {
			displayHelp();
			System.exit(0);
		}
		else if(args.length != 0 && args[0].equals("-Tips")){
			displayTips();
			System.exit(0);
		}
		else if(args.length != 0 && args[0].equals("-DEV")){
			displayDevMode();
			System.exit(0);
		}
		else if(args.length != 0){
			GameLogic.printHeading("Something Went Wrong... This isn't the Game or Help or Tips or DEV...");
			System.exit(0);
		}
		
		//Welcome message
		GameLogic.clearConsole();
		GameLogic.printSeparator();
		System.out.println("\t\t\tGame Name: Wrong Place Wrong Time");
		GameLogic.printSeparator();
		System.out.println(" Welcome to Group: Weronies' Final CS2011 Game..."
							+ "\n Made by: Slok Patel, Joseph Acosta, Miguel Campos and Steven Yang");
		GameLogic.printSeparator();		
		
		System.out.println(" This game is BEST played in [Git Bash Settings]:"
							+ "\n\t Dimensions: 743 x 448, Width: 743 Height: 448 pixel"
							+ "\n\t Note: The game is meant to bully you, but I don't mean it [Its a Joke]");
		GameLogic.printSeparator();
		
		System.out.println(" If you need Help/Tips, Please use 'java Main -help or read the 'Readme.txt'"
							+ "\n It contains: How to download and run the game. RoadMap and Group Presentation");
		GameLogic.printSeparator();
		GameLogic.printHeading("Game START!!!");
		GameLogic.anythingToContiune();
		GameLogic.clearConsole();
		
		//Starts the game
		GameLogic.gameStart();
	}
	
	//Method to display -help
	public static void displayHelp() {
		GameLogic.clearConsole();
		GameLogic.printSeparator();
		System.out.println(" There are some helpful infomation in the 'Readme.txt' file"
							+ "\n [Some infomation may be out of date or may be wrong]"
							+ "\n because we only tested on windows operating system(OS)"
							+ "\n and IDE. I may or may not haven't updated some infomation..."
							+ "\n It contains: How to download and run the game. RoadMap and Group Presentation");
		GameLogic.printSeparator();
		
		GameLogic.anythingToContiune();
		GameLogic.clearConsole();
		
		GameLogic.printSeparator();
		System.out.println("\t\t\tHINT(S)");
		GameLogic.printSeparator();
		System.out.println("[1]: Do The Gacha for more gold or loot");
		System.out.println("[2]: Use your potions");
		System.out.println("[3]: Spend your Skill wisely");
		System.out.println("[4]: Everytime you use a skill it gets remove");
		System.out.println("[5]: Every Act REMOVES ALL your skills");
		System.out.println("[6]: You can't stack Skills");
		System.out.println("[7]: Use Long Rest Whenever you can");
		System.out.println("[8]: Get better LUCK LOL or cheat...");
		
		GameLogic.anythingToContiune();
		GameLogic.clearConsole();
		
		GameLogic.printSeparator();
		System.out.println("\t\t\tGAME RULE(S)");
		GameLogic.printSeparator();
		System.out.println("[1]: Input the values That it asked for such as number(s) within the range");
		System.out.println("[2]: Keep on kill people/things so you can gain xp to move forward");
		System.out.println("[3]: Almost everything is random");
		System.out.println("[4]: Keep on entering (1) for 'Continue on your journey' for encounter(s) to\n     spawn. It may appear nothing but just keep on entering (1).");
		System.out.println("[5]: The encounters are randomly generated so you may get: \n     A Blank or Battle or Long Rest or Shop");
		System.out.println("[6]: When you reach the right xp number you will continue to the next act");
		System.out.println("[7]: Try your luck or cheat...");
		
		GameLogic.anythingToContiune();
		GameLogic.clearConsole();
		
		GameLogic.printSeparator();
		System.out.println("Use '-Tips' to display Tips Commands/Mode");
		GameLogic.printSeparator();
		
		System.out.println("");
		
		GameLogic.printSeparator();
		System.out.println("Use '-DEV' to display DEV Commands/Mode");
		GameLogic.printSeparator();
		GameLogic.anythingToContiune();
	}
	
	//Method to display -Tips
	public static void displayTips() {
		GameLogic.printSeparator();
		System.out.println("When Your Health reaches 0, You are dead");
		GameLogic.printSeparator();
	}
	
	//Method to display -DEV
	public static void displayDevMode() {
		GameLogic.printSeparator();
		System.out.println("Enter 'DEV MODE MAX' as player name to enter DEV MODE MAX"
							+ "\n[This Max Everything]");
		GameLogic.printSeparator();
		System.out.println("Enter 'DEV MODE POOR' as player name to enter DEV MODE POOR"
							+ "\nThis Max Everything, but gold]");
		GameLogic.printSeparator();
		System.out.println("Enter 'DEV MODE ONE PUNCH' as player name to enter DEV MODE ONE PUNCH"
							+ "\n[This Max HP, ATTACK and DEFENSE]");
		GameLogic.printSeparator();
		GameLogic.anythingToContiune();
		GameLogic.clearConsole();
		
		GameLogic.printSeparator();
		System.out.println("This is helpful to test most of the game");
		System.out.println("This WILL break the game");
		GameLogic.printSeparator();
		GameLogic.anythingToContiune();
		GameLogic.clearConsole();
	}
}