package section07;

public class HeroMain {
	public static void main(String[] args) {
		Hero h = new Hero("â����"); //���� ��ü
		Item weapon1 = new Spear("���ֹ��� ����"); // ������ ��ü
		Item weapon2 = new Spear("����");
		Item weapon3 = new Sword("������ �б�");
		Item weapon4 = new Sword("����");
		Item weapon5 = new Sword("��������");
		
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
