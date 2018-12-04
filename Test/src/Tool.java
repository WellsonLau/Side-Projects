
public class Tool implements Workshop{
	private String weapon;
	
	public Tool() {
		
	}
	
	public Tool(String tool) {
		this.weapon = tool;
	}

	public String getWeapon() {
		return weapon;
	}

	@Override
	public void setUpStation() {
		System.out.println("workbench is not set up!");
	}
}
