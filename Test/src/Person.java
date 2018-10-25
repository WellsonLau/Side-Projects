
public class Person {
	private Tool tool;
	private String name;
	private int level;
	
	public Person() {
		
	}
	
	public Person(Tool weapon){
		this.tool = weapon;
	}
	
	public String getName() {
		return name;
	}
	
	//used to access the Tool's class that is held by the person
	public Tool getTool() {
		return tool;
	}
	
	public void setLevel(int targetLevel) {
		this.level = targetLevel;
	}
	
	public int getLevel() {
		return level;
	}
}
