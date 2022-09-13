package AsssignmentOperator;

public class AssignmentOperatorEx {

	public static void main(String[] args) {
		int result = 5;
		result += 10;
		System.out.println("+= : "+result);
		
		result = 10;
		result -= 3;
		System.out.println("-= : "+result);
		
		result = 5;
		result *= 10;
		System.out.println("*= : "+result);
		
		result = 10;
		result /= 2;
		System.out.println("/= : "+result);
		
		result = 12;
		result %= 5;
		System.out.println("%= : "+result);
	}

}
