package section.exam09;

public class Calculator {

		static void powerOn() {
			System.out.println("������ ŵ�ϴ�.");
		}
		static void powerOff() {
			System.out.println("������ ���ϴ�.");
		}
		int plus(int x, int y) {
			int result = x + y ;
			return result;
		}
		double divide(int x, int y) {
			double result = (double)x/y;
			return result;
		}
		public static void main(String[] args) {
			powerOn();
			powerOff();
		}
			
		
		
}
