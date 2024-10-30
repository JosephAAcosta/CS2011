public abstract class Character {
	//Attributes That All Characters Have
	public String name;
	public int maxHp, hp, xp, devAtk, devDef;
	
	//Constructor For The Character
	public Character(String name, int maxHp, int xp) {
		//Using this keyword to Eliminate confusion between class attributes and parametes with same name
		this.name = name;
		this.maxHp = maxHp;
		this.xp = xp;
		this.hp = maxHp;
		this.devAtk = 0;
		this.devDef = 0;
	}
	
	//Methods For Character's attack and defense
	public abstract int attack();
	public abstract int defend();
}