import java.util.Random;

public class Monster extends Creature{
	private int turnDamage;
	
	public Monster(String name, int health, int attackDamage) {
		super(name, health, attackDamage);
		super.setCurrHealth(health);
	}
	
	public void attack(Player player) {
		Random rand = new Random();
		setTurnDamage(rand.nextInt(super.getAttackDamage()));
		player.setCurrHealth(player.getCurrHealth() - turnDamage); 
	}
	
	public int getTurnDamage() {
		return this.turnDamage;
	}
	
	public void setTurnDamage(int damage) {
		this.turnDamage = damage;
	}
	
}
