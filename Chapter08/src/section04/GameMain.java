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
				System.out.println("테스트");
			}
			
			
			@Override
			public void move() {
				System.out.println("이동합니다.");
			}
			
			@Override
			public void lift() {
				System.out.println("들어 올립니다.");
			}
		}; 
		System.out.println(liftable2.test);
		liftable2.test1();
		
		
		
		
	}
}
