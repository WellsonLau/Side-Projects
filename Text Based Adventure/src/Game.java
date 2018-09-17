import java.util.*;

public class Game {
	
	public Game(){
		
	}
	
	public void startGame() {
		//parameters - (rows in map, columns in map, starting x coordinate, starting y coordinate) 
		Map map = new Map(2, 2, 0, 0); 
		Scanner input = new Scanner(System.in);	
		
		System.out.print("Welcome to my game, enter your name: ");
		String heroName = input.nextLine();
		//Character creation for the game - base stats of 100 health and 10 AD
		Human player = new Human(heroName, 100, 10);
		
		introDialogue(player, input);
		
		//performs action based on the player's choice
		options(player, map);
		
	}
	
	public void options(Human player, Map map) {
		if(player.getChoice() == 1) {
			System.out.println(stats(player));
		}
		if(player.getChoice() == 2) {
			map.displayMap();
		}
	}
	
	//returns player name and hp
	public String stats(Human player) {
		String stats = "/// " + player.getName() + ", HP: " + player.getHealth() + " ///";
		return stats;
	}
	
	//spawning player and giving them options on what to do
	public void introDialogue(Human player, Scanner input) {
		System.out.println("\nGreetings " + player.getName() + "\n\n" +
				"You wake up in a daze with your back lying on a wall.\n\n" +
				"You see a road ahead of you, what would you like to do?\n\n" +
				"1. view status\n2. view map\n3. move\n");

		int choice = input.nextInt();
		player.setChoice(choice);
	}
	
}
