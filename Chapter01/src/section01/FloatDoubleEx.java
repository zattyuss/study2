package section01;

public class FloatDoubleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Ǽ��� ����
		double var1 = 3.14d;
//		float var2 = 3.14;
		float var2 = 3.14F;
		
		// ���е� �׽�Ʈ : float���� double�� �� ������ ���� �����Ѵ�.
		double var4 = 0.12345678901234567890;
		float var5 = 0.12345678901234567890F;
		System.out.println("var4 : "+ var4); // 0.12345678901234568
		System.out.println("var5 : "+ var5);  // 0.12345679
		           
		// e ���
//		int var6 = 3e6; //������ ����
		int var6 = 3000000;
		double var7 = 7e6;
		float var8 = 3e6F;
		double var9 = 3e-6;
		
		
	}

}
