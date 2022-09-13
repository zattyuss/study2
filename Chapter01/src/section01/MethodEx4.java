package section01;

public class MethodEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int addResult = add(10,2);
		System.out.println(addResult);
		
		double doubleResult = divide(10,2);
		System.out.println(doubleResult);
	}
	
	public static int add(int a, int b) {
		int result = a+b;
		return result;
	}
	
	public static double divide(int a, double b) {
		double result = a/b;
		return result;
	}
}
