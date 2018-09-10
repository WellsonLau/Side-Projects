
public class Human extends Creature{
	int choice;
	
	public Human() {
	
	}
	
	public Human(String name, int health, int attackDamage) {
		super(name, health, attackDamage);
	}
	
	public void setChoice(int choice) {
		this.choice = choice;
	}
	
	public int getChoice() {
		return choice;
	}
}
