package section.exam09;

public class CalculatorEx {
	public static void main(String[] args) {
		Calculator.powerOn();
		Calculator.powerOff();
		Calculator cal = new Calculator();
		int plus = cal.plus(19, 3);
		double divide = cal.divide(10, 2);
		System.out.println(plus);
		System.out.println(divide);
		
		String str ="ȫ�浿";
		System.out.println(str.length());
		System.out.println(Double.isNaN(10.0%0));
		
		
		
	}
}
