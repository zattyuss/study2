package section.exam13;

public class CalculatorEx {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		int result1 = cal.areaRectangle(10);
		int result2 = cal.areaRectangle(10,5);
		
		System.out.println("���̰� 10�� ���簢�� ���� : "+ result1);
		System.out.println("����, ���� ���̰� ���� 10, 5�� ���簢�� ���� :"+ result2);
		
	}
}
