
public class Map {
	private String location;
	private int positionX; //x coordinate(rows) of map
	private int positionY; //y coordinate(columns) of map
	private int numRows; //number of rows for the rooms
	private int numCols; //number of columns for the rooms
	Room[][] grid;
	
	public Map() {
		
	}
	
	public Map(int row, int column, int xStart, int yStart) {
		grid = new Room[row][column];
		numRows = row;
		numCols = column;
		this.positionX = xStart;
		this.positionY = yStart;
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
		/*
		else if(direction.equals("west")) {
			if(getPositionY() == 0) {
				System.out.println("can't move " + direction);
			}
		else if(direction.equals("east")) {
			if(getPositionY() == grid.length - 1) {
				System.out.println("can't move " + direction);
			}
			else if(getPositionX() != grid.length - 1) {
				setPositionY(getPositionY() + 1);
			}
		}
		else if(direction.equals("south")) {
			if(getPositionX() == grid.length - 1) {
				System.out.println("can't move " + direction);
			}
			else if(getPositionX() != grid.length - 1) {
				setPositionX(getPositionX() + 1);
			}
		}
		*/
	
	public void displayLocation() {
		System.out.println("\nYou are currently on: " + getLocation() + "\n");
	}
	public void displayMap() {
		//print out column letters
		System.out.print("\t" + "|  ");
		for(int i = 0; i < getNumCols(); i++) {
			System.out.print((char)(i + 65) + "  |  ");
		}
		System.out.println();
		
		//row formatting
		for(int i = 0; i < getNumRows(); i++) {
			System.out.print("      " + i + " " + "|");
			for(int j = 0; j < getNumCols(); j++) {
				//implementing x to mark current position
				if(i == getPositionX() && j == getPositionY()) {
					System.out.print("  x");
				}
				else {
					System.out.print("   ");//fix the spacing that 'X' would take up otherwise
				}
				System.out.print("  |");
			}
			if(i == getNumRows()/2) { //directional guide printed in middle to the right of the map
				System.out.print("\t");
				printMapKey();
			}
			System.out.println();
		}
	}
	
	public void printMapKey() {
		System.out.print("legend");
	}

	public String getLocation() {
		this.location = "" + (char)(getPositionY() + 65) + (getPositionX());
		return location;
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
	
	public int getNumRows() {
		return numRows;
	}
	
	public int getNumCols() {
		return numCols;
	}
}
