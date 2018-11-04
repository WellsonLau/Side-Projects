public class TestRunner{

	public static void main(String args[]) {
		/*-------CLASSES-------
		 * classes can use overloaded methods, own methods, or parent methods
		 * can be tedious to code same methods over & over again if subclasses are expressing similar methods not contained in parent
		 * how to fix? use Interface, located down below.
		*/
		Tool test1 = new Tool();
		test1.setUpStation();
		test1.getWeapon();

		/*-------INTERFACES-------
		 *interface can only use its own methods
		 *is a contract - methods must be defined in the classes that implement the interface later on
		 *express common functionalities btw classes that implement it
		 */
		Workshop test2 = new Tool();
		test2.setUpStation();
	}
	
	//-------------------NOTES-------------------//
	/*accessing an object within an object
	Tool knife = new Tool("knife");
	Person testPerson = new Person(knife);
	System.out.println(testPerson.getTool().getWeapon());
	 */

	/*adding variables to a constructor that wasn't existent upon initialization
	testPerson.setLevel(100);
	System.out.println(testPerson.getLevel());
	 */

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
