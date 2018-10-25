
public class Map {
	private int numRows; //number of rows for the rooms
	private int numCols; //number of columns for the rooms

	public Map() {
		
	}
	
	public Map(int row, int column) {
		this.numRows = row;
		this.numCols = column;
	}
	
	public void printMapKey() {
		System.out.print("legend");
	}

	
	public int getNumRows() {
		return numRows;
	}
	
	public int getNumCols() {
		return numCols;
	}
}
