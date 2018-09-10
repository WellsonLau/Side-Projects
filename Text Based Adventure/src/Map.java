
public class Map {
	private int xCoord;
	private int yCoord;
	private int numRows;
	private int numCols;
	int[][] grid;
	
	public Map(int row, int column) {
		this.grid = new int[row][column];
		numRows = row;
		numCols = column;
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				this.grid[i][j] = 0;
			}
		}
	}
	
	public void displayMap() {
		for(int i = 0; i < getNumRows(); i++) {
			for(int j = 0; j < getNumCols(); j++) {
				System.out.println(grid[i][j]);
			}
		}
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
