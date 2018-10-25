import java.util.ArrayList;

public class Room extends Map{
	private int roomNumber;
	private boolean explored;
	private ArrayList<Creature> monsters;
	private ArrayList<Creature> NPCs;
	
	public Room() {
		
	}

	public Room(ArrayList<Creature> monsters, ArrayList<Creature> NPCs) {
		this.monsters = monsters;
		this.NPCs = NPCs;
	}
	
	public void roomExplored(boolean explored) {
		this.explored = explored;
	}
	
	public void addMonster(Creature monster) {
		this.monsters.add(monster);
	}
	
	public void addNPC(Creature NPC) {
		this.NPCs.add(NPC);
	}
	
	/*public void assignRoomNumber(int num) {
		this.roomNumber = num;
	}*/
	
	public int roomNumber() {
		return roomNumber;
	}
	
	public void test() {
		System.out.println("test");
	}
}
