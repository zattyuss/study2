package section01;

public class NaNCheckEx {

	public static void main(String[] args) {
		
		//�Ǽ�Ÿ�� ����Ŭ������ ���ǵ� NaN
		System.out.println(Double.NaN);
		
		//�Ǽ�Ÿ�� 0.0 �Ǵ� 0.0f�� ������ ������ �ϴ� ���
		int x= 5;
		double d =0.0;
		double result1 = x%d;
		System.out.println("double Ÿ�� : "+ result1); //���ܹ߻�X
		
		float f = 0.0f;
		float result2 = x%f;
		System.out.println("float Ÿ�� : "+result2);
	}

}
