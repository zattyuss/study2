package section01;

public class InfinityAndNaNCheck {

	public static void main(String[] args) {
		
		double i1 = 5/0.0;
		System.out.println(Double.isInfinite(i1));
		
		double i2 = 5%0.0;
		System.out.println(Double.isNaN(i2));

	}

}
