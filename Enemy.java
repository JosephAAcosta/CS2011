public class Enemy extends Character{
	//Variable to Store the Players Current XP
	int playerXp;
	
	//Enemy Specific Constructor
	public Enemy(String name, int playerXp) {
		//Access the superclass contructor from Character file
		super(name, 100, (int)(Math.random() * 9 + 1));
		
		//Assigning Variable
		this.playerXp = playerXp;
	}

	//Creating method for Enemy's attack and defence
	//Overriding the parent class(Character.java)
	@Override
	public int attack() {
		//Calculations for attack
		int dealt = (int)(Math.random() * 10 + 5);
		return dealt;
	}

	@Override
	public int defend() {
		//Calculations for defense
		int taken = (int)(Math.random() * 5 + 1);
		return taken;
	}
}