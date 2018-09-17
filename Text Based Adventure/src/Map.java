
public class Map {
	private int xCoord; //rows
	private int yCoord; //columns
	private int numRows; //number of rows for the rooms
	private int numCols; //number of columns for the rooms
	Room[][] grid;
	
	public Map() {
		
	}
	
	public Map(int row, int column, int xStart, int yStart) {
		grid = new Room[row][column];
		numRows = row;
		numCols = column;
		//starting coordinates of a map will be placed as (xStart, yStart)
		xCoord = xStart;
		yCoord = yStart;
	}
	
	public void displayMap() {
		//print out column letters
		System.out.print("\t| ");
		for(int i = 0; i < getNumCols(); i++) {
			System.out.print((char)(i + 65) + " | ");
		}
		System.out.println("\n");
		
		//for printing int values of grid
		for(int i = 0; i < getNumRows(); i++) {
			System.out.print("      " + (i + 1) + " | ");
			for(int j = 0; j < getNumCols(); j++) {
				System.out.print(grid[i][j] + " | ");
			}
			System.out.println();
		}
		
		location();
	}
	
	public void location() {
		System.out.println("\n" + "You are currently on: " +(char)(yCoord + 65) + (xCoord + 1));
	}
	
	public int positionX() {
		return xCoord;
	}
	
	public int positionY() {
		return yCoord;
	}
	
	public int getNumRows() {
		return numRows;
	}
	
	public int getNumCols() {
		return numCols;
	}
}
