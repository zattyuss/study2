package calculator;

public class CalculatorEx {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.executeAvg(22, 12);
		System.out.println();
		
		int result1 = cal.plus("10", "20");
		System.out.println(result1);
	}
}
