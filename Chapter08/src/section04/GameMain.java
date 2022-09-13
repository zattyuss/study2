package section04;

import terran.section2.Liftable;

public class GameMain {
	public static void main(String[] args) {
		Liftable liftable1 = new Dummy();
		liftable1.lift();
		liftable1.move();
		Dummy dummy = (Dummy) liftable1;
		System.out.println(dummy.test);
		dummy.test();
		
		Liftable liftable2 = new Liftable() {
			
			int test = 1000;
			public void test1() {
				System.out.println("�׽�Ʈ");
			}
			
			
			@Override
			public void move() {
				System.out.println("�̵��մϴ�.");
			}
			
			@Override
			public void lift() {
				System.out.println("��� �ø��ϴ�.");
			}
		}; 
		System.out.println(liftable2.test);
		liftable2.test1();
		
		
		
		
	}
}
