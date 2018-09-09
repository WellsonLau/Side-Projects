import java.util.*;

public class Game {
	
	public Game(){
		
	}
	
	public void startGame() {
		Scanner input = new Scanner(System.in);
		System.out.print("Welcome to my game, enter your name: ");
		String heroName = input.nextLine();
		
		//Character creation for the game - base stats of 100 health and 10 AD
		Human player = new Human(heroName, 100, 10);	
		int choice = introDialogue(player, input);
		options(player, choice);
		
	}
	
	public void options(Human player, int choice) {
		if(choice == 1) {
			System.out.println(stats(player));
		}
		if(choice == 2) {
			displayMap();
		}
	}
	
	public void displayMap() {
		String[][] map = new String[2][2];
		//columns
		for(int i = 0; i < map[i].length; i++) {
			System.out.println((char)i + 65);
			//rows
			for(int j = 0; j < map[i].length; j++) {
				System.out.println((i + 1) + " |\t");
			}
		}
	}
	
	//returns player name and hp
	public String stats(Human player) {
		String stats = "/// " + player.getName() + ", HP: " + player.getHealth() + " ///";
		return stats;
	}
	
	//spawning player and giving them options on what to do
	public int introDialogue(Human player, Scanner input) {
		System.out.println("\nGreetings " + player.getName() + "\n");
		System.out.println("You wake up in a daze with your back lying on a wall.\n");
		System.out.println("You see a road ahead of you, what would you like to do?\n");
		System.out.println("1. view status\n2. view map\n3. move");
		
		int choice = input.nextInt();
		return choice;
	}
	
}
