
public class Creature {
	private String name;
	private int gold;
	private int maxHealth;
	private int currHealth;
	private int attackDamage;
	private int positionX; //x coordinate(rows) on map
	private int positionY; //y coordinate(columns) on map
	private String location;
	
	public Creature(){
	}

	public Creature(String name, int health, int attackDamage) {
		this.name = name;
		this.maxHealth = health;
		currHealth = maxHealth;
		this.attackDamage = attackDamage;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getGold() {
		return gold;
	}

	public void setGold(int value) {
		gold = value;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int health) {
		this.maxHealth = health;
	}

	public int getCurrHealth() {
		return currHealth;
	}
	
	public void setCurrHealth(int health) {
		this.currHealth = health;
	}

	public int getAttackDamage() {
		return attackDamage;
	}
	
	public void setAttackDamage(int damage) {
		this.attackDamage = damage;
	}

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int Xcoord) {
		this.positionX = Xcoord;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int Ycoord) {
		this.positionY = Ycoord;
	}

	public String getLocation() {
		this.location = "" + (char)(getPositionY() + 65) + (getPositionX());
		return location;
	}

	public String getStats() {
		//returns player name and hp
		return "\n------------------------------\n" 
		+ "adventurer \"" + name + "\"\n" 
		+ "HP: " + getCurrHealth() + "/" + getMaxHealth() 
		+ "\n------------------------------\n";
	}

	public void move(Map map, String direction) {
		int numRows = map.getNumRows();
		int numCols = map.getNumCols();

		switch(direction) {
		case "north": //
			if(getPositionX() != 0) { //Move north if possible
				setPositionX(getPositionX() - 1);
			}
			else {
				System.out.println("Can't move " + direction + " from " + getLocation() + "\n");
			}
			break;
		case "west": //
			if(getPositionY() != 0) { //Move west if possible
				setPositionY(getPositionY() - 1);
			}
			else {
				System.out.println("Can't move " + direction + " from " + getLocation() + "\n");
			}
			break;
		case "south": 
			if(getPositionX() != numRows - 1) { //Move south if possible
				setPositionX(getPositionX() + 1);
			}
			else {
				System.out.println("Can't move " + direction + " from " + getLocation() + "\n");
			}
			break;
		case "east": //
			if(getPositionY() != numCols - 1) { //Move east if possible
				setPositionY(getPositionY() + 1);
			}
			else {
				System.out.println("Can't move " + direction + " from " + getLocation() + "\n");
			}
			break;
		}
		//in the case that the new spot has an enemy, option to battle it
	}

		/*
		if(numDirection.equals("1") || numDirection.equalsIgnoreCase("north")) { //North
			if(player.getPositionX() != 0) {
				player.moveNorth();
			}
			else {
				System.out.println("Can't move " + direction + " from " + player.getLocation());
				System.out.println();
			}
		}
		else if(numDirection.equals("2")) { //West
			if(player.getPositionY() != 0) {
				player.moveWest();
			}
			else {
				System.out.println("Can't move " + direction + " from " + player.getLocation());
				System.out.println();
			}
		}
		else if(numDirection.equals("3")) { //South
			if(player.getPositionX() != numRows - 1) {
				player.moveSouth();
			}
			else {
				System.out.println("Can't move " + direction + " from " + player.getLocation());
				System.out.println();
			}
		}
		else if(numDirection.equals("4")) { //East
			if(player.getPositionY() != numCols - 1) {
				player.moveEast();
			}			
			else {
				System.out.println("Can't move " + direction + " from " + player.getLocation());
				System.out.println();
			}
		}
		else {
			System.out.println("invalid response");
			System.out.println();
		}
		*/
}