package section.exam11;

public class Calculator {
	
	int plus(int x, int y) {
		return x+y;
	}
	
	double avg(int x, int y) {
		return plus(x,y) / 2.0;
		
	}
	
	void println(String message) {
		System.out.println("����� ����մϴ�.");
		System.out.println(message);
	}
	
	void executeAvg(int x, int y) {
		println("������ : "+ avg(x,y));
		System.out.println("���� ����");
	}
	
}
