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
 
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- 
How to download the file
	Step 1: Download the CS2011FinalGame.zip
		Download the CS2011FinalGame.zip
	
	Step 2: Extract
		Extract all CS2011FinalGame.zip to your deivce
	
	Step 3: Remove -1
		For some reason canvas rename our files with -1 at the end. So please remove them
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------	


If using Command Prompt:
	Step 1: Open
		Open command Prompt
	
	Step 2: Set Path:
		set path={[Name of the drive]:\Program Files\Java\jdk-_ _ _._._\bin} (the file location of JDk)
		EX: set path=O:\Program Files\Java\jdk-14.0.21\bin
		
	Step 3: Set File location
		cd [the file location of where you download the CS2011FinalGame.zip file] 
			EX: cd O:\Users\Name\Downloads\CS2011FinalGame
	
	Step 4: Run
		java Main
		
		Extra: Mode
			java Main -help		[This opens help mode]
			java Main -Tips		[This opens Game Tips mode]
			java Main -DEV		[This opens Developer mode]

		
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------	


If using Visual Studio Code:
	Step 1: Open
		Open Visual Studio Code
	
	Step 2: Open File
		Click on File [Top left]
		Click on Open  [ShortCut: CTRL + o]
		Open Main.java
		
	Step 3: Run
		Click on Terminal [Top left or Bottom middle (you may already have it open)]
		java Main
		
		Extra: Mode
			java Main -help		[This opens help mode]
			java Main -Tips		[This opens Game Tips mode]
			java Main -DEV		[This opens Developer mode]
			
	
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------	

If using Git Bash
	Step 1: Open File
		Open CS2011FinalGame File
		
	Step 2: Git Bash
		Right click and Git Bash Here 
		run 'ls' to check if location is correct it should say a list of files:
				- Character.class  Enemy.java       Main.class    Player.java  Story.java
				- Character.java   GameLogic.class  Main.java     Readme.txt
				- Enemy.class      GameLogic.java   Player.class  Story.class
		or see if your things says " ~.../CS2011FinalGame" (This may look different since my laptop is windows)
		
	Step 3: Run
		java Main
		
		Extra: Mode
			java Main -help		[This opens help mode]
			java Main -Tips		[This opens Game Tips mode]
			java Main -DEV		[This opens Developer mode]

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------	


How to play:
	Step 1: Compile (Skip if you're running from .class) (if you are compile, you may have to do in the following order)
		javac Story.java
		javac Character.java
		javac Player.java
		javac Enemy.java
		javac SideGame.java
		javac GameLogic.java
		javac Main.java

	Step 2: Run
		java Main
		
		Extra: Mode
			java Main -help		[This opens help mode]
			java Main -Tips		[This opens Game Tips mode]
			java Main -DEV		[This opens Developer mode]
	
	Note: Class problem
		You may run into problems with class being newer class version, so you have to delete the .class and compile them yourself.
		This may fix the problem. I'm not sure
	
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------	

If you run into any problems GOOD LUCK (me joking)(ask me...) (⨀﹏⨀)

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

GAME NAME: Wrong Place Wrong Time

RoadMap:
[DONE]  * Main Game Mech
			- When uses a skills, It gets removed from their list
			
[DONE]	* Create player							
[DONE]	* Hit Points (HP)						
[DONE]	* Shield								
[DONE]	* Experience Points (XP)				
[DONE]	* Money									
[DONE]	* Shop									
[DONE]	* Rest									
[DONE]	* Gacha
[DONE]	* Leveling System
			- Improve on the current Leveling System

[DONE]	* Skills
		* Color Text
		* Visuals
		* Read .txt and .png files
		* GUI
		* Lore
		* Add more
			- Enemies
			- Areas
			- Encounters
			- Storys/Acts
			- Skills
			
		* Game Scaling...
		* Co Op (**)
		* Mini Games
			- Find Stick_Man
			- Connect 4
			- Others
			
[DONE]	* Attack Skills
[DONE]	* Defense Skills
		* Inventory	
			- Sword
				- Katana (Drop Rate)
				- LongSword
				- Wakizashi
				- Rapier
				- Claymore
		
			- Shield
				- Round Shield
				- Riot Shield
				- Turtle Shell
				- Kite Shield
			
			- Gun
				- Heavy Sniper (Half HP)
				- Golden Gun (One shot)
			
			- Potions
[DONE]			- Health					   
				- Shield
			
		* Quest line
[DONE]		- Act XXX
[DONE]		- Final Boss					   



Group Name: Weronies
Group Presentation:
Your presentation should last 10 minutes and include:
	* Game Name:
		Wrong Place Wrong Time
	* Type of Game:
	Text and Turn based Adventure Game
{Steven}
	* Brief overview of the rules of the game
		GameRules:
			[1]: Input the values that it asked for such as number(s) within the range"
			[2]: Keep on kill people/things so you can gain xp to move forward"
			[3]: Keep on entering (1) for 'Continue on your journey' for encounter(s) to spawn. It may appear nothing but just keep on entering (1)."
			[4]: When you reach the right xp number you will continue to the next act"
	* Brief demo
		Different Modes [-help / -Tips / -DEV]
		‘-help’ Includes: Information that helps the player. It contains Hints, Game Rules and other modes
		‘-Tips’ Includes: Tips to help the user; Redundant Advice
		‘Dev’ Includes: For people wanting to test the game without dying because it gives the player(999999999: Health, Gold, Potions, Long Rest). Side note: This will break the game
		It will display a message if user enters the wrong words
{Slok}
	Main Game: You start the game by inputting the ‘username’ you want your character to have.
	Storyline: Your character’s storyline starts in his hometown, where everything is going perfectly. He takes an unfortunate turn when he consumes bread and suddenly gets hit in the head by a flying sausage, ultimately knocking him unconscious. He wakes up in an unfamiliar village where he has to battle a random enemy boss, which is either “Evil Knight", "Goblin", "Wolf", "Spirit Orb", "Wazy With A Long Sword.” The game continues to repeat, allowing the character to fight different bosses in different worlds/maps. The game will come to an end when the character either dies or makes it to the end where he will fight the final boss or “The Creator.”

{Joe}
	Character Info: The character has a name that the gamer has imputed as mentioned before. The start the said player off with 10,000 HP(Health), 0 XP(Experience Points), 1000 Gold(The currency in the game), 2 Long Rest(s)(Which will be explained), 40 Healing Potion(s), an offensive trait of ‘Power Slash’, and a defensive trait of ‘Strong Back’. 
	Long Rests - Heals amount random, heals more than the potion (random too)
	Offensive Trait: That would be our implementation of a skill (Power Attack)
	Increases your attack hitpoints by 15 (Skill is lost when used)
	Defensive Trait: That would be our implementation of a skill (Defense Move)
	Increases your defense by 5  (Skill is lost when used)
	Gacha: Lets the user spend 100 gold to have a chance of getting loot
	Shop: Where you buy potions from.
	Long Rest: Allows the character to rest which heals their health randomly.

{Steven}
	* Overview of implementation -- you can talk about overall structure and/or a particularly interesting piece of code.
		Main contains
			The different modes
			The start of the game which calls the method from GameLogic
		GameLogic contains
			It's the brain of the game
			Pretty much game rules
		Story contains
			Story is written here
		Character contains
			Parent Class
			The attributes that all entities will have
		Player and Enemy contains
			Child Class
			Setting their attributes

{Slok}
	* What technologies did you use to work remotely as a team (if you worked remotely)
		Discord
		Visual studio code(VS Code) live share [Didn't work as planned]
		Google Docs

{Joe}
	* Interesting bugs you encountered and how you solved them
		Had Problems with
			Player input their name
				Made a new scanner for it
					Main issue was that when players were to input more than one word where the name should be at, the console would take it as a completely new command. 
					The way we fixed this problem was creating a new scanner that just fixed it.
			Defend Trait wasn't showing in character info
				numDefUpgrades to += array number for that skill
					Originally wouldn’t display the correct number of skills for every iteration since the skills are store in an array. At first, 
					we had the numDefUpgrades incrementing by itself but it would not display correctly on the screen. Solution: It was to add the number location of the skill in the array. 

{Miguel}
	* What plans you have for this game in the future as you continue learning to program.
		RoadMap:
			Improve on the current Leveling System
			Color Text
			Make it Read .txt and .png files
			Graphical user interfaces(GUI)
			Background lore in items
			Add more
				Enemies
				Areas
				Encounters
			Stories\Acts
			Different Skills
			Improve on Game Scaling
			Co Op
			Mini Games
				Find Stick_Man
				Connect 4
			Expand on Inventory
				Swords (Drop Rate
					Katana
					LongSword
					Wakizashi
					Rapier
					Claymore
				Shield
					Round Shield
					Riot Shield
					Turtle Shell
					Kite Shield
				Gun
					Heavy Sniper (Half Hp)
					Golden Gun (One shot
				Potions
					Shield
			
			
Story Template 
	public static void actIIntro(){
		GameLogic.clearConsole();
		GameLogic.printSeparator();
		System.out.println("Act III - Intro");
		GameLogic.printSeparator();
		System.out.println("Story...");
		System.out.println(" "
							+ "\n "
							+ "\n "
							+ "\n ");
		GameLogic.printSeparator();
		GameLogic.anythingToContiune();
	}
	
	public static void actIOutro(){
		GameLogic.clearConsole();
		GameLogic.printSeparator();
		System.out.println("Act III - Outro");
		GameLogic.printSeparator();
		System.out.println("Story...");
		System.out.println(" "
							+ "\n "
							+ "\n "
							+ "\n ");
		GameLogic.printSeparator();
		GameLogic.anythingToContiune();
	}