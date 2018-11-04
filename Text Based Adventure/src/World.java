//@author Wellson Lau
import java.util.Scanner;
import java.util.ArrayList;

public class World {

	public static void main(String args[]) {
		int numMapRows = 3;
		int numMapCols = 3;
		GameFunctions adventure = new GameFunctions();
		Scanner input = new Scanner(System.in);	
		
		//Adding objects such as monsters/items/NPCs/buildings to the map//
		Map map = new Map("Forest", numMapRows, numMapCols); //parameters - (rows in map, columns in map) 
		Room[][] grid = new Room[numMapRows][numMapCols];
		for(int i = 0; i < numMapRows; i++) {
			for(int j = 0; j < numMapCols; j++) {
				grid[i][j] = new Room();
			}
		}
		//--------------------------TEST BENCH--------------------------
		///*
		Creature goblin = new Creature();
		Player bob = new Player();
		System.out.println(bob.getGold()); //variables of type int for objects initialized to 0 
		grid[0][0].test();
		grid[0][0].addMonster(goblin);
		//*/
		
		//--------------------------Game Start--------------------------
		System.out.print("Welcome to my game, enter your name: ");
		String heroName = input.nextLine();
		Player player = new Player(heroName, 100, 10, 0, 0); //Character creation for the game - base stats of 100 health and 10 AD
		player.setPositionX(0); //starting x coordinate for player
		player.setPositionY(0); //starting y coord

		adventure.introDialogue(player, input);

		while(adventure.gameEnd() == false) {
			adventure.optionsDialogue(); //asks for user choice
			adventure.options(player, map, input); //functions for the choice
		}
	}
}
