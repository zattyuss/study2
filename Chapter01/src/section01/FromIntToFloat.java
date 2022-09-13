package section01;

public class FromIntToFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1234567890;
		int num2 = 1234567890;
		
		float num3 = num2; // int에서 float으로 자동타입변환
		num2 = (int) num3; // float에서 int 강제타입변환
		
		// 데이터 손실이 없다면 다음 결과값은 0이되어야 한다.
		int result = num1 - num2;
		System.out.println(result);
	}

}
