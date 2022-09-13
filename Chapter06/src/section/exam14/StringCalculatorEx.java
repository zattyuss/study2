package section.exam14;

public class StringCalculatorEx {
	public static void main(String[] args) {
		
		StringCalculator cal = new StringCalculator();
		
		int result = cal.add(10,2);
		System.out.println(result);
		
		int result2 = cal.add("10","2");
		System.out.println(result2);
		
		int result3 = cal.add("b10bb","a2bdd");
		System.out.println(result3);
		
	}
}
