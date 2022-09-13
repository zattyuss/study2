package section07;

public class HeroMain {
	public static void main(String[] args) {
		Hero h = new Hero("창술사"); //영웅 객체
		Item weapon1 = new Spear("저주받은 인형"); // 아이템 객체
		Item weapon2 = new Spear("원한");
		Item weapon3 = new Sword("예리한 둔기");
		Item weapon4 = new Sword("절정");
		Item weapon5 = new Sword("질량증가");
		
		h.setItem(weapon1);
		h.info();
		System.out.println("=================================");
		
		h.setItem(weapon2);
		h.info();
		System.out.println("=================================");
		
		h.setItem(weapon3);
		h.info();
		System.out.println("=================================");
		
		h.setItem(weapon4);
		h.info();
		System.out.println("=================================");
		
		h.setItem(weapon5);
		h.info();
		System.out.println("=================================");
	}
}
