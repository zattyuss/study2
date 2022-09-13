package compareEx;

public class CompareOperator2 {

	public static void main(String[] args) {

		// char 타입의 비교연산 : 유니코드값으로 비교
		char char1 = 'A';
		char char2 = 'B';
		System.out.println(char1 > char2);
		System.out.println(char1 < char2);
		
		// 서로다른 타입의 비교연산 : 더 큰 타입으로 변환 후 비교
		int val1 = 3;
		float val2 = 3.0f;
		System.out.println(val1==val2);
		
		// double float의 비교연산
		System.out.println(3.14f == 3.14);

	}

}
