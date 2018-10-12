
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
	
	public void move(String direction) {
		if(direction.equals("north")) {
			if(getPositionX() == 0) {
				System.out.println("can't move " + direction);
			}
			else if(getPositionX() != 0) {
				setPositionX(getPositionX() - 1);
			}
		}
		else if(direction.equals("west")) {
			if(getPositionY() == 0) {
				System.out.println("can't move " + direction);
			}
			else if(getPositionY() != 0) {
				setPositionY(getPositionY() - 1);
			}
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
	}
	
	public void displayMap() {
		//print out column letters
		System.out.print("\t| ");
		for(int i = 0; i < getNumCols(); i++) {
			System.out.print((char)(i + 65) + " | ");
		}
		System.out.println("\n");
		
		//row formatting
		for(int i = 0; i < getNumRows(); i++) {
			System.out.print("      " + i + " | ");
			for(int j = 0; j < getNumCols(); j++) {
				System.out.print("  | ");
			}
			System.out.println();
		}
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
