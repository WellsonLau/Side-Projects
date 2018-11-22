
public class Monster extends Creature{
	
	public Monster(String name, int health, int attackDamage) {
		super(name, health, attackDamage);
		super.setCurrHealth(health);
	}
}
