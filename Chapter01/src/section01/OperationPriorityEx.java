package section01;

public class OperationPriorityEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 나머지 연산자
		System.out.println("12를 5로 나누었을 때 나머지 : " + 12%5);
		
		// 산술연산자와 연산 방향은 왼족에서 오른쪽이다.
		int num = 9 * 4 / 3 % 5;
		System.out.println("num : " + num);
		
		// 대입연산자와 우선순위
		int a,b,c; //타입이 같다면 쉼표를 사용하여 동시에 선언 가능
		
		// 대입연산자의 연산 방향은 오른쪽에서 왼쪽이다.
		// 즉, c=5, b=c, a=b 순서로 대입 연산이 수행된다.
		a=b=c=5;
		
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		System.out.println("c=" +c);
	}

}
