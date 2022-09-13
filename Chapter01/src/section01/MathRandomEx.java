package section01;

public class MathRandomEx {

	public static void main(String[] args) {
		double random = Math.random();
		System.out.println(random);
		
		int num = (int) (Math.random()*10)+1;
		System.out.println(num);
		
		int dice = (int) ((Math.random()*6)+1);
		System.out.println(dice);
		
		int lotto = (int) ((Math.random()*45)+1);
		System.out.println(lotto);
	}

}
