package section01;

public class FloatDoubleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 실수값 저장
		double var1 = 3.14d;
//		float var2 = 3.14;
		float var2 = 3.14F;
		
		// 정밀도 테스트 : float보다 double이 더 정밀한 값을 저장한다.
		double var4 = 0.12345678901234567890;
		float var5 = 0.12345678901234567890F;
		System.out.println("var4 : "+ var4); // 0.12345678901234568
		System.out.println("var5 : "+ var5);  // 0.12345679
		           
		// e 사용
//		int var6 = 3e6; //컴파일 에러
		int var6 = 3000000;
		double var7 = 7e6;
		float var8 = 3e6F;
		double var9 = 3e-6;
		
		
	}

}
