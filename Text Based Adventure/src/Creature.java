
public class Creature {

	private String name;
	private int health;
	private int attackDamage;

	public Creature() {
		
	}
	
	public Creature(String name, int health, int attackDamage) {
		this.name = name;
		this.health = health;
		this.attackDamage = attackDamage;
	}

	public void Speak() {
		System.out.println("Hello adventurers, my name is " + getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}

}