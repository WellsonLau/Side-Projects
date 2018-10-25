import java.util.Scanner;
import java.util.ArrayList;

public class World {

	public static void main(String args[]) {
		int numMapRows = 3;
		int numMapCols = 3;
		Game adventure = new Game();
		Scanner input = new Scanner(System.in);	
		
		//Adding objects such as monsters/items/NPCs/buildings to the map//
		Map map = new Map(numMapRows, numMapCols); //parameters - (rows in map, columns in map) 
		Creature goblin = new Creature();
		Room[][] grid = new Room[numMapRows][numMapCols];
		for(int i = 0; i < numMapRows; i++) {
			for(int j = 0; j < numMapCols; j++) {
				grid[i][j] = new Room();
			}
		}
		grid[0][0].test();
		//-----------------------------------------------------------
		
		System.out.print("Welcome to my game, enter your name: ");
		String heroName = input.nextLine();
		Player player = new Player(heroName, 100, 10); //Character creation for the game - base stats of 100 health and 10 AD
		player.setPositionX(0); //starting x coordinate for player
		player.setPositionY(0); //starting y coord

		adventure.introDialogue(player, input);

		while(adventure.gameEnd() == false) {
			adventure.optionsDialogue(); //asks for user choice
			adventure.options(player, map, input); //functions for the choice
		}
	}
}
