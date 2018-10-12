import java.util.*;

public class Game {
	private boolean gameEnd;

	public Game(){

	}

	public void options(Human player, Map map, Scanner input) {
		String choice = input.next();
		if(choice.equals("1") || choice.equalsIgnoreCase("move")) {
			map.displayMap();
			
			System.out.print("which direction?\n" + "1. North\t 2. West\n3. South\t 4. East\n");
			String direction = input.next();
			if(direction.equals("1") || direction.equalsIgnoreCase("north")) {
				map.move("north");
			}
			else if(direction.equals("2")) {
				map.move("west");
			}
			else if(direction.equals("3")) {
				map.move("south");
			}
			else if(direction.equals("4")) {
				map.move("east");
			}
			else {
				System.out.println("invalid response");
			}
			System.out.println("You are currently on: " + map.getLocation() + "\n");
		}
		else if(choice.equals("2")) {
			map.displayMap();
		}
		else if(choice.equals("3")) {
			System.out.println(stats(player));
		}
		else if(choice.equals("quit")) {
			gameEnd = true;
		}
		else {
			System.out.println("invalid response");
		}
		//input.nextLine(); //clear the buffer so the program doesn't ignore next user input
	}

	//returns player name and hp
	public String stats(Human player) {
		String stats = "\n/// " + player.getName() + ", HP: " + player.getHealth() + " ///\n";
		return stats;
	}

	//spawning player and giving them options on what to do
	public void introDialogue(Human player, Scanner input) {
		System.out.println("\nGreetings " + player.getName() + "\n\n" +
				"You wake up in a daze with your back lying on a wall.\n" +
				"You see a road ahead of you, what would you like to do?\n");
	}

	public void optionsDialogue() {
		System.out.print("1. move " + "\n"
				+ "2. view map " + "\n"
				+ "3. view status " + "\n\n" 
				+ "Enter a number input, or type 'quit': ");
	}
	
	public boolean gameEnd() {
		return gameEnd;
	}
}
