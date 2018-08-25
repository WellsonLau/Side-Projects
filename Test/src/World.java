import java.util.*;

public class World {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		//Character creation for the game
		Hero protagonist = new Hero();
		
		System.out.print("Welcome to my game, what is your name: ");
		String heroName = input.nextLine();
		
		protagonist.setName(heroName);
		System.out.println(protagonist.getName());
	}
}
