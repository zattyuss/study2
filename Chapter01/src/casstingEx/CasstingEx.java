package casstingEx;

public class CasstingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		// double -> int ����Ÿ�Ժ�ȯ
		double doubleValue = 3.14;
		intValue = (int) doubleValue; //double > int ����Ÿ�Ժ�ȯ�� �ʿ�
		System.out.println(intValue); //������ �ս� �߻�
		
				
	}

}
