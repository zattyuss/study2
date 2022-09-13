package calculator;

public class Calculator {
		
	
	public int plus(int x, int y) {
		return x+y;
	}
	public int plus(String x, String y) {
		int num1 = Integer.parseInt(x);
		int num2 = Integer.parseInt(y);
		return num1+num2;
	}
	
	
	
	public int minus(int x, int y) {
		return x-y;
	}
	public int multiply(int x, int y) {
		return x*y;
	}
	public double devide(int x, int y) {
		return (double)x/y;
	}
	private double avg(int x, int y) {
		return plus(x,y) / 2.0;
	}
	private void println(String message) {
		System.out.println("평균을 계산합니다.");
		System.out.println(message);
	}
	public void executeAvg(int x, int y) {
		println("실행결과 : " + avg(x,y));
		System.out.println("실행 종료");
	}
}
