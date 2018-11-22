
public class Player extends Creature implements Battle{
	private String choice;
	private String action;
	
	public Player() {
	
	}
	
	public Player(String name, int health, int attackDamage, int startX, int startY) {
		super(name, health, attackDamage);
	}
	public String getChoice() {
		return choice;
	}
	
	public void setChoice(String choice) {
		this.choice = choice;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String choice) {
		if(getChoice().equals("1a") || getChoice().equals("1b") || getChoice().equals("1c") || getChoice().equals("1d")) {//player chooses to move
			this.action = "move";
		}
		else if(getChoice().equals("quit")) {
			this.action = "quit";
		}
		else if(getChoice().equals("2")) {
			this.action = "view map";
		}
		else if(getChoice().equals("3")) {
			this.action = "view status";
		}
		else {
			this.action = "invalid";
		}
	}
	public void displayLocation() {
		System.out.println("\nYou are currently on: " + getLocation() + "\n");
	}
	
	public void displayMap(Map currMap) {
		//print out column letters
		System.out.println("Forest - " + "You are currently on: " + getLocation() + "\n");
		System.out.print("\t" + "|  ");
		for(int i = 0; i < currMap.getNumCols(); i++) {
			System.out.print((char)(i + 65) + "  |  ");
		}
		System.out.println();
		
		//row formatting
		for(int i = 0; i < currMap.getNumRows(); i++) {
			System.out.print("      " + i + " " + "|");
			for(int j = 0; j < currMap.getNumCols(); j++) {
				//implementing x to mark current position
				if(i == getPositionX() && j == getPositionY()) {
					System.out.print("  x");
				}
				else {
					System.out.print("   ");//fix the spacing that 'X' would take up otherwise
				}
				System.out.print("  |");
			}
			if(i == currMap.getNumRows()/2) { //directional guide printed in middle to the right of the map
				System.out.print("\t");
				//printMapKey();
			}
			System.out.println();
		}
	}
	
	public void consumeHealthPotion(Consumable potion) {
		setCurrHealth(getCurrHealth() + potion.getHp()); //adds the potion's hp amount to player's current health
		if(getCurrHealth() > getMaxHealth()) {
			setCurrHealth(getMaxHealth());
		}
	}

	@Override
	public void attack(Creature enemy) {
		enemy.setCurrHealth(enemy.getCurrHealth() - super.getAttackDamage());
	}

	@Override
	public void battle(Creature enemy) {
	int turn = 0;
	
	while(getCurrHealth() != 0 || enemy.getCurrHealth() != 0) { //Eventually change this to check for battle situation
		//Battle menu - attack/items/flee
		enemy.setCurrHealth(enemy.getCurrHealth() - getAttackDamage());
		System.out.println("You dealt " + getAttackDamage());
		System.out.println(enemy.getName() + "'s health: " + enemy.getCurrHealth());
	}
		
	}
	
}
