package section.exam12;

public class CalculatorEx {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int result1 = cal.add(5, 6);
		System.out.println(result1);
		
		double result2 = cal.add(5.1, 6.1);
		System.out.println(result2);
		
		double result3 = cal.add(5.1, 6);
		System.out.println(result3);
		double result4 = cal.add(5, 6.1);
		System.out.println(result4);
		
		
		
	}
}
