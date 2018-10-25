import java.util.*;

public class Game {
	private boolean gameEnd;

	public Game(){

	}

	public void options(Player player, Map map, Scanner input) {
		int numRows = map.getNumRows();
		int numCols = map.getNumCols();
		String choice = input.next();
		if(choice.equals("1") || choice.equalsIgnoreCase("move")) {
			System.out.println();
			player.displayMap(numRows, numCols);
			System.out.print("\n" + "1. North\t 2. West\n3. South\t 4. East\n\nwhich direction? ");
			String numDirection = input.next();
			System.out.println();
			move(player, numDirection, map);
			player.displayMap(numRows, numCols);
			System.out.println();
		}
		else if(choice.equals("2")) {
			System.out.println();
			System.out.println("You are currently on: " + player.getLocation() + "\n");
			player.displayMap(numRows, numCols);
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
		//input.nextLine(); //clear the buffer so the program doesn't ignore next user input
	}

	public void move(Player player, String numDirection, Map map) {
		int numRows = map.getNumRows();
		int numCols = map.getNumCols();
		String direction = directionConvert(numDirection);
		
		if(numDirection.equals("1") || numDirection.equalsIgnoreCase("north")) { //North
			if(player.getPositionX() != 0) {
				player.moveNorth();
			}
			else {
				System.out.println("Can't move " + direction + " from " + player.getLocation());
				System.out.println();
			}
		}
		else if(numDirection.equals("2")) { //West
			if(player.getPositionY() != 0) {
				player.moveWest();
			}
			else {
				System.out.println("Can't move " + direction + " from " + player.getLocation());
				System.out.println();
			}
		}
		else if(numDirection.equals("3")) { //South
			if(player.getPositionX() != numRows - 1) {
				player.moveSouth();
			}
			else {
				System.out.println("Can't move " + direction + " from " + player.getLocation());
				System.out.println();
			}
		}
		else if(numDirection.equals("4")) { //East
			if(player.getPositionY() != numCols - 1) {
				player.moveEast();
			}			
			else {
				System.out.println("Can't move " + direction + " from " + player.getLocation());
				System.out.println();
			}
		}
		else {
			System.out.println("invalid response");
			System.out.println();
		}
	}
	
	//returns player name and hp
	public String stats(Player player) {
		String stats = "\n/// " + player.getName() + ", HP: " + player.getHealth() + " ///\n";
		return stats;
	}

	//spawning player and giving them options on what to do
	public void introDialogue(Player player, Scanner input) {
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
	
	public String directionConvert(String input) {
		String direction = "";
		if(input.equals("1")) {
			direction = "north";
		}
		else if(input.equals("2")) {
			direction = "west";
		}
		else if(input.equals("3")) {
			direction = "south";
		}
		else if(input.equals("4")) {
			direction = "east";
		}
		return direction;
	}
	
	
}
