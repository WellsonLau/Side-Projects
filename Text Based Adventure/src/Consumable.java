
public class Consumable extends Item{
	private int hpValue;
	
	public Consumable() {
		
	}
	
	public Consumable(int hpValue) {
		this.hpValue = hpValue;
	}
	
	public int getHp() {
		return hpValue;
	}
	
	public void setHp(int hpValue) {
		this.hpValue = hpValue;
	}
}
