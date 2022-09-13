package section02;

public class GameMain {
	public static void main(String[] args) {
		
		Building barracks = new Barracks(Barracks.MAX_HP, 1500);
		
		Barracks barracks2 =  (Barracks) barracks;
		
		barracks2.move();
		barracks2.lift();
		barracks2.move();
		barracks2.lift();
		barracks2.move();
		barracks2.repare();
		barracks2.generateUnit();
		
		System.out.println("====================================");
		
		Academy academy = new Academy(Academy.MAX_HP, 1000);
		academy.repare();
		academy.upgrade("½ºÆÀÆÑ");
	}
}
