package section02;

public abstract class Building {
	
	protected int hp;
	protected int buildTime;
	
	public Building(int hp, int buildTime) {
		this.hp = hp;
		this.buildTime = buildTime;
	}

	public int getHp() {
		return this.hp;
	}

	public abstract void setHp(int hp) ;
}
