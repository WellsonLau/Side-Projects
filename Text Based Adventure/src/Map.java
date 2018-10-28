
public class Map {
	private int numRows; //number of rows for the rooms
	private int numCols; //number of columns for the rooms
	private String mapName;
	
	public Map() {
		
	}
	
	public Map(String name, int row, int column) {
		this.mapName = name;
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
	
	public String getMapName() {
		return mapName;
	}
	
	public void setMapName(String newName) {
		this.mapName = newName;
	}
}
