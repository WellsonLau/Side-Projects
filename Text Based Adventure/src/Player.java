
public class Player extends Creature{
	private String location;
	private int positionX; //x coordinate(rows) on map
	private int positionY; //y coordinate(columns) on map
	
	public Player() {
	
	}
	
	public Player(String name, int health, int attackDamage) {
		super(name, health, attackDamage);
	}
	
	public void displayLocation() {
		System.out.println("\nYou are currently on: " + getLocation() + "\n");
	}
	
	public void displayMap(int numRows, int numCols) {
		//print out column letters
		System.out.print("\t" + "|  ");
		for(int i = 0; i < numCols; i++) {
			System.out.print((char)(i + 65) + "  |  ");
		}
		System.out.println();
		
		//row formatting
		for(int i = 0; i < numRows; i++) {
			System.out.print("      " + i + " " + "|");
			for(int j = 0; j < numCols; j++) {
				//implementing x to mark current position
				if(i == getPositionX() && j == getPositionY()) {
					System.out.print("  x");
				}
				else {
					System.out.print("   ");//fix the spacing that 'X' would take up otherwise
				}
				System.out.print("  |");
			}
			if(i == numRows/2) { //directional guide printed in middle to the right of the map
				System.out.print("\t");
				//printMapKey();
			}
			System.out.println();
		}
	}
	
	public void moveNorth() {
		setPositionX(getPositionX() - 1);
	}
	
	public void moveWest() {
		setPositionY(getPositionY() - 1);
	}
	
	public void moveEast() {
		setPositionY(getPositionY() + 1);
	}
	
	public void moveSouth() {
		setPositionX(getPositionX() + 1);
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
	
	/*
	public void setChoice(String choice) {
		this.choice = choice;
	}
	
	public String getChoice() {
		return choice;
	}
	*/
}
