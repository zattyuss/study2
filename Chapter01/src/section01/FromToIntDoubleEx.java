package section01;

public class FromToIntDoubleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 1234567890;
		int num2 = 1234567890;
		
		double num3 = num2; //int에서 double으로 자동타입변환
		num2 = (int) num3; // double에서 int 강제타입변환
		//데이타 손실이 없다면 다음 결과값은 0이 되어야 한다.
		int result = num1 - num2;
		System.out.println(result);
	}

}
