public class Test{

	public static void main(String args[]) {
		//accessing an object within an object
		Tool knife = new Tool("knife");
		Person testPerson = new Person(knife);
		System.out.println(testPerson.getTool().getWeapon());
		
		//adding variables to a constructor that wasn't existent upon initialization
		testPerson.setLevel(100);
		System.out.println(testPerson.getLevel());
	}

	/*
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
		*/
	}
