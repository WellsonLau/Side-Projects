import java.util.Scanner;

public class World {

	public static void main(String args[]) {
		Game adventure = new Game();
		Map map = new Map(3, 3, 0, 0); //parameters - (rows in map, columns in map, starting x coordinate, starting y coordinate) 
		Scanner input = new Scanner(System.in);	

		System.out.print("Welcome to my game, enter your name: ");
		String heroName = input.nextLine();
		Human player = new Human(heroName, 100, 10); //Character creation for the game - base stats of 100 health and 10 AD

		adventure.introDialogue(player, input);

		while(adventure.gameEnd() == false) {
			adventure.optionsDialogue(); //asks for user choice
			adventure.options(player, map, input); //functions for the choice
		}
	}
}
