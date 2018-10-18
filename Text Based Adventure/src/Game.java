import java.util.*;

public class Game {
	private boolean gameEnd;

	public Game(){

	}

	public void options(Human player, Map map, Scanner input) {
		String choice = input.next();
		if(choice.equals("1") || choice.equalsIgnoreCase("move")) {
			System.out.println();
			map.displayMap();
			System.out.print("\n" + "1. North\t 2. West\n3. South\t 4. East\n\nwhich direction? ");
			String choiceDirection = input.next();
			String direction = directionConvert(choiceDirection);
			System.out.println();
			if(choiceDirection.equals("1") || direction.equalsIgnoreCase("north")) { //North
				if(map.getPositionX() != 0) {
					map.moveNorth();
				}
				else {
					System.out.println("Can't move " + direction + " from " + map.getLocation());
					System.out.println();
				}
			}
			else if(choiceDirection.equals("2")) { //West
				if(map.getPositionY() != 0) {
					map.moveWest();
				}
				else {
					System.out.println("Can't move " + direction + " from " + map.getLocation());
					System.out.println();
				}
			}
			else if(choiceDirection.equals("3")) { //South
				if(map.getPositionX() != map.getColLength()) {
					map.moveSouth();
				}
				else {
					System.out.println("Can't move " + direction + " from " + map.getLocation());
					System.out.println();
				}
			}
			else if(choiceDirection.equals("4")) { //East
				if(map.getPositionY() != map.getRowLength() - 1) {
					map.moveEast();
				}			
				else {
					System.out.println("Can't move " + direction + " from " + map.getLocation());
					System.out.println();
				}
			}
			else {
				System.out.println("invalid response");
				System.out.println();
			}
			map.displayMap();
			System.out.println();
		}
		else if(choice.equals("2")) {
			System.out.println();
			System.out.println("You are currently on: " + map.getLocation() + "\n");
			map.displayMap();
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
