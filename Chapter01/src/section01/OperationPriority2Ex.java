package section01;

public class OperationPriority2Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 단합연산자 : 부호연산자
		int num1 = -10; // 부호연산자 한번적용
		int num2 = -+10; // 연산의 순서 +10, -+10
		int num3 = - -10; // 연산의 순서 -10, - -10
		System.out.println("num1: "+ num1);
		System.out.println("num2: "+ num2);
		System.out.println("num3: "+ num3);

		//괄호는 최우선연산 순위를 갖는다.
		int var1=1;
		int var2=2;
		int var3=3;
		int result = (var1 + var2) * var3;
		System.out.println("result:"+ result);
	}

}
