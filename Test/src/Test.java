public class Test{

	public static void main(String args[]) {
		displayMap();
	}

	public static void displayMap() {
		int x = 2;
		int y = 2;
		int[][] grid = new int[x][y];
		
		//init all values in grid to 0
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				grid[i][j] = 0;
			}
		}
		
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				System.out.println(grid[i][j]);
			}
		}
		
	}
	
}
