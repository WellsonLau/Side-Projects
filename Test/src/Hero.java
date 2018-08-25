
public class Hero {

	String name;
	String gender;
	String race;
	int health;
	int attackDamage;

	public Hero() {
		health = 100;
		attackDamage = 10;
		race = "human";
	}

	public void Speak() {
		System.out.println("Hello adventurers, my name is " + name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}