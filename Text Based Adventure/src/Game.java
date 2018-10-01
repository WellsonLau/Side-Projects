import java.util.*;

public class Game {

	public Game(){

	}

	public void startGame() {
		Map map = new Map(2, 2, 0, 0); //parameters - (rows in map, columns in map, starting x coordinate, starting y coordinate) 
		Scanner input = new Scanner(System.in);	

		System.out.print("Welcome to my game, enter your name: ");
		String heroName = input.nextLine();

		Human player = new Human(heroName, 100, 10); //Character creation for the game - base stats of 100 health and 10 AD

		introDialogue(player, input); //Game begins & asks user for his choice
		String response = input.nextLine();

		while(!response.toLowerCase().equals("quit")) {
			options(player, map, input, response); //performs action based on the player's choice
			System.out.println("1. move " + "   "
					+ " 2. view map " + "   "
					+ " 3. view status "
					+ "   ------------   Type 'quit' to quit\n");
			response = input.nextLine();
		}
	}

	public void options(Human player, Map map, Scanner input, String choice) {
		if(choice.equals("1")) {
			System.out.println("which direction?\n" + "1. North\t 2. West\n3. South\t 4. East");
			String direction = input.next();
			if(direction.equals("1")) {
				map.move("north");
			}
			else if(direction.equals("2")) {
				map.move("west");
			}
			else if(direction.equals("3")) {
				map.move("south");
			}
			else if(direction.equals("2")) {
				map.move("east");
			}
			System.out.println();
			System.out.println("You are currently on: " + map.getLocation());
		}
		else if(choice.equals("2")) {
			map.displayMap();
			System.out.println("\n" + "You are currently on " + map.getLocation() + "\n");
		}
		else if(choice.equals("3")) {
			System.out.println(stats(player));
		}
		else {
			System.out.println("invalid response");
		}
	}

	//returns player name and hp
	public String stats(Human player) {
		String stats = "/// " + player.getName() + ", HP: " + player.getHealth() + " ///\n";
		return stats;
	}

	//spawning player and giving them options on what to do
	public void introDialogue(Human player, Scanner input) {
		System.out.println("\nGreetings " + player.getName() + "\n\n" +
				"You wake up in a daze with your back lying on a wall.\n" +
				"You see a road ahead of you, what would you like to do?\n");

		System.out.println("1. move " + "   "
				+ " 2. view map " + "   "
				+ " 3. view status "
				+ "   ------------   Type 'quit' to quit\n");
	}

}
