package section.exam17;

public class CalculatorEx {
	public static void main(String[] args) {
		
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 2);
		int result3 = Calculator.minus(10, 2);
		System.out.println("result1 : "+ result1);
		System.out.println("result2 : "+ result3);
		System.out.println("result3 : "+ result3);
		
		Calculator cal = new Calculator();
		int result5 = cal.minus(10, 3);
		int result6 = cal.minus(10, 3);
		System.out.println("result5 :"+result5);
		System.out.println("result6 :"+result6);
		
		Calculator cal1 = new Calculator();
		Calculator cal2 = new Calculator();
		System.out.println(cal1.num);
		System.out.println(cal2.num);
		cal.num = 100;
		System.out.println(cal1.num);
		System.out.println(cal2.num);
		
		System.out.println(cal1.pi);
		System.out.println(cal2.pi);
		cal1.pi = 1000;
		System.out.println(cal1.pi);
		System.out.println(cal2.pi);
		
		
		
	}
}
