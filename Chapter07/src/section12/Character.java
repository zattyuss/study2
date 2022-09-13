package section12;

public class Character {
	
	private int hp;
	private int mp;
	private int maxHp = 500;
	private int maxMp = 200;
	public Character() {
	
	}
	public Character(int hp, int mp) {
		this.hp = hp;
		this.mp = mp;
	}
	
	public void usePotion(Potion potion ) {
		potion.recovery(this);

	}
	@Override
	public String toString() {
		return "Character [hp : " + hp + ", mp : " + mp + "]";
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxH) {
		this.maxHp = maxH;
	}
	public int getMaxMp() {
		return maxMp;
	}
	public void setMaxMp(int maxMp) {
		this.maxMp = maxMp;
	}
	
}
