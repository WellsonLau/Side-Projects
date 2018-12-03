//@author Wellson Lau
import java.util.Scanner;
import java.util.ArrayList;

public class World {

	public static void main(String args[]) {
		GameFunctions adventure = new GameFunctions();
		Scanner input = new Scanner(System.in);	
		
		Monster goblin = new Monster("Billy", 20, 5);
		Player bob = new Player();
		bob.setName("bob");
		bob.setMaxHealth(100);
		bob.setCurrHealth(100);
		bob.setAttackDamage(10);
		
		adventure.battle(bob, goblin, input);
	}

		/*
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
		
		/*
		 
		//--------------------------Game Start--------------------------
		System.out.print("Welcome to my game, enter your name: ");
		String heroName = input.nextLine();
		Player player = new Player(heroName, 100, 10, 0, 0); //Character creation for the game - base stats of 100 health and 10 AD

		adventure.introDialogue(player, input);

		while(adventure.gameEnd() == false) {
			adventure.optionsDialogue(); //asks for user choice
			adventure.options(player, map, input); //functions for the choice
		}
		*/
	
		//System.out.println(bob.getGold()); //objects' int variables initialized to 0 
		//map[0][0].test();
		//map[0][0].addMonster(goblin);
	
}
