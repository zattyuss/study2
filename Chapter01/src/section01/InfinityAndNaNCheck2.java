package section01;

public class InfinityAndNaNCheck2 {

	public static void main(String[] args) {
		double result1 = 5/0.0;
		double result2 = 5%0.0;
		double result3 = 10%4.5;
		
		isNanOrInfinite(result1);
		isNanOrInfinite(result2);
		isNanOrInfinite(result3);
	}
	
	public static void isNanOrInfinite(double result) {
		if(Double.isInfinite(result) || Double.isNaN(result)) {
			System.out.println("������ ������ �� �����ϴ�.");
			return; //�Ʒ� �޼ҵ� ����� �������� �ʰ� �޼ҵ带 Ż���Ѵ�.
		}
		System.out.println("����� ����� " + result + "�Դϴ�.");
	}
	

}
