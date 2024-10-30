public class Player extends Character{
	//Store Number of Upgrades/Skills in Each Path
	public int numAtkUpgrades, numDefUpgrades;
	
	//Additional Player Stats
	int gold, longRest, pots;
	
	//Arrays to store skill names
	public String[] atkUpgrades = {"" , "Power Slash", "Accelerate", "Moon Steel", "Endless Cut"};
	public String[] defUpgrades = {"" , "Strong Back", "HardSkin", "Rugged", "Holy Aura"};
	
	//Player specific constructor	
	public Player(String playerName) {
		//Calling constructor of superclass
		super(playerName, 10000, 0);
		
		//Setting # of upgrades to 0
		this.numAtkUpgrades = 0;
		this.numDefUpgrades = 0;
		
		//set additional stats
		this.gold = 1000;
		this.longRest = 2; 
		this.pots = 40;
		this.devAtk = 0;
		this.devDef = 0;
		
		//let the player Choice a trait when creating a new character
		ChoiceTrait();
	}

	//Let the player Choice a trait of either skill path
	public void ChoiceTrait() {
		//Player picks Attack Skill:
		GameLogic.clearConsole();
		GameLogic.printHeading("Choice an Attack trait:");
		for(int i = 1; i < atkUpgrades.length; i++) {
			System.out.println("[" + i + "]  " + atkUpgrades[i]);
		}
		int atkInput = GameLogic.checkInput("Enter The Number Of Choice: ", 4);
		GameLogic.clearConsole();
		boolean atkHold = true;
		while(atkHold) {
			if (atkInput == 0) {
				System.out.println("You chose Nothing");
				GameLogic.anythingToContiune();
			}
			else if (atkInput == 1) {
				GameLogic.printHeading("You chose " + atkUpgrades[1] + "!");
				numAtkUpgrades += 1;
				atkHold = false;
				GameLogic.anythingToContiune();
			}
			else if (atkInput == 2) {
				GameLogic.printHeading("You chose " + atkUpgrades[2] + "!");
				numAtkUpgrades += 2;
				atkHold = false;
				GameLogic.anythingToContiune();
			}
			else if (atkInput == 3) {
				GameLogic.printHeading("You chose " + atkUpgrades[3] + "!");
				numAtkUpgrades += 3;
				atkHold = false;
				GameLogic.anythingToContiune();
			}
			else if (atkInput == 4) {
				GameLogic.printHeading("You chose " + atkUpgrades[4] + "!");
				numAtkUpgrades += 4;
				atkHold = false;
				GameLogic.anythingToContiune();
			}
		}
		
		//Player picks Defense Skill:
		GameLogic.clearConsole();
		GameLogic.printHeading("Choice a Defensive trait:");
		for(int i = 1; i < defUpgrades.length; i++) {
			System.out.println("[" + i + "]  " + defUpgrades[i]);
		}
		int defInput = GameLogic.checkInput("Enter The Number Of Choice: ", 4);
		GameLogic.clearConsole();
		boolean defHold = true;
		while(defHold) {
			if (defInput == 0) {
				GameLogic.printHeading("You chose Nothing");
				GameLogic.anythingToContiune();
			}
			else if (defInput == 1) {
				GameLogic.printHeading("You chose " + defUpgrades[1] + "!");
				numDefUpgrades += 1;
				defHold = false;
				GameLogic.anythingToContiune();
			}
			else if (defInput == 2) {
				GameLogic.printHeading("You chose " + defUpgrades[2] + "!");
				numDefUpgrades += 2;
				defHold = false;
				GameLogic.anythingToContiune();
			}
			else if (defInput == 3) {
				GameLogic.printHeading("You chose " + defUpgrades[3] + "!");
				numDefUpgrades += 3;
				defHold = false;
				GameLogic.anythingToContiune();
			}
			else if (defInput == 4) {
				GameLogic.printHeading("You chose " + defUpgrades[4] + "!");
				numDefUpgrades += 4;
				defHold = false;
				GameLogic.anythingToContiune();
			}
		}
	}
	
	
	//Creating method for player's attack and defence
	//Overriding the parent class(Character.java)
	@Override
	public int attack() {
		//Calculations for attack
		int dealt = (int)(Math.random() * 20 + 8);
		return dealt;
	}
	
	@Override
	public int defend() {
		//Calculations for defense
		int taken = (int)(Math.random() * 5 + 1);
		return taken;
	}
}