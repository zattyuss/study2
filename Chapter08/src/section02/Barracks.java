package section02;

import terran.section2.Generatable;

public class Barracks extends Building implements Generatable{
	
	public final static int MAX_HP = 1500;
	private boolean isLiftState = false;
	
	public Barracks(int hp, int builTime) {
		super(hp, builTime);
		System.out.println("병력을 생성합니다.");
	}
	@Override
	public void setHp(int hp) {
		this.hp = hp > MAX_HP ? MAX_HP : hp;
	}
	@Override
	public void lift() {
		String message = isLiftState ? "건물을 내립니다." : "건물을 들어 올립니다.";
		System.out.println(message);
		this.isLiftState = !isLiftState;
	}
	@Override
	public void move() {
		if(isLiftState) {
			System.out.println("건물을 이동합니다.");
			return;
		}
		System.out.println("건물을 이동할 수 없습니다.");
	}
	@Override
	public void generateUnit() {
		System.out.println("유닛을 생산합니다.");
		
	}
	@Override
	public void repare() {
		System.out.println("건물을 수리합니다.");
		
	}
	
}
