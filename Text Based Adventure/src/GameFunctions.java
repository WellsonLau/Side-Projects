import java.util.*;

public class GameFunctions {
	private boolean gameEnd;

	public void options(Player player, Map map, Scanner input) {
		player.setChoice(input.next()); //grabbing user's input
		player.setAction(player.getChoice()); //determining what the game will do based on user's input
		
		switch(player.getAction()) {
		case "move": //player chooses option 1 to move
			System.out.println();
			player.displayMap(map);
			System.out.println();
			player.move(map, choiceToDirection(player.getChoice()));
			player.displayMap(map);
			System.out.println();
			break;
		case "view map": //player chooses option 2 to view map
			System.out.println();
			player.displayMap(map);
			System.out.println();
			break;
		case "view status": //player chooses option 3 to view status
			System.out.println(player.getStats());
			break;
		case "quit": //player types in quit, so game ends
			gameEnd = true;
			break;
		case "invalid": //player types an invalid response
			System.out.println("\n" + "invalid response" + "\n");
			break;
		}
		//input.nextLine(); //clear the buffer so the program doesn't ignore next user input
	}

	public void battle(Player player, Monster enemy, Scanner input) {
		while(player.alive() || enemy.alive()) { //check for battle situation
			int turn = 0;
			if(turn % 2 == 0) { //Player's turn
				System.out.println("Your health: " + player.getCurrHealth() + "\n" 
						+ enemy.getName() + "'s health: " + enemy.getCurrHealth() + "\n");
				//Battle menu - attack/items/flee
				optionsInterface(player, enemy, input);
				turn++;
			}
			if(turn % 2 != 0) { //Enemy's turn
				enemy.attack(player);
				System.out.println(enemy.getName() + " dealt " + enemy.getTurnDamage()
				+ " damage to you." + "\n");
			}
		}
	}
	
	public void optionsInterface(Player player, Monster enemy, Scanner input) {
		String choice = "";
		
		System.out.println("1. Attack");
		System.out.println("2. Items");
		System.out.println("3. Flee" + "\n");
		System.out.print("What would you like to do: ");

		if(input.hasNext()) {
			choice = input.next();
		}

		switch(choice) {
		case "1":
			System.out.println();
			player.attack(enemy);
			System.out.println("You dealt " + player.getRandomDamage() + " damage to " + enemy.getName() + "\n");
			break;
		}
	}
	
	//spawning player and giving them options on what to do
	public void introDialogue(Player player, Scanner input) {
		System.out.println("\nGreetings " + player.getName() + "\n\n" +
				"You wake up in a daze with your back lying on a wall.\n" +
				"You see a road ahead of you, what would you like to do?\n");
	}

	public void optionsDialogue() {
		System.out.print("1a. Move N \t 1b. Move W \t 1c. Move S \t 1d. Move E" + "\n"
				+ " 2. View map " + "\n"
				+ " 3. View status " + "\n\n" 
				+ "Enter input, or type 'quit': ");
	}
	
	public String choiceToDirection(String input) { //when user wants to move, convert their input(ex: 1a for north) to it's direction counterpart
		if(input.equals("1a")) {
			input = "north";
		}
		else if(input.equals("1b")) {
			input = "west";
		}
		else if(input.equals("1c")) {
			input = "south";
		}
		else if(input.equals("1d")) {
			input = "east";
		}
		return input;
	}
	
	public boolean gameEnd() {
		return gameEnd;
	}
	
}
