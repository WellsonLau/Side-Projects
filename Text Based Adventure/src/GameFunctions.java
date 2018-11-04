import java.util.*;

public class GameFunctions {
	private boolean gameEnd;

	public GameFunctions(){

	}

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
	}
		/* OLD CODE 
		 * using if else for options
		}
		else if(choice.equals("2")) {
			System.out.println();
			player.displayMap(map);
			System.out.println();
		}
		else if(choice.equals("3")) {
			System.out.println(stats(player));
		}
		else if(choice.equals("quit")) {
			gameEnd = true;
		}
		else {
			System.out.println("invalid response");
			System.out.println();
		}
		*/
		//input.nextLine(); //clear the buffer so the program doesn't ignore next user input
	
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
