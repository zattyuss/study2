package checkEx;

public class CheckVauleBeforCastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 120;
		
		if( i< Byte.MIN_VALUE ||  i > Byte.MAX_VALUE) {
			System.out.println("byte Ÿ������ ��ȯ �� �� ����");
			System.out.println("���� �ٽ� Ȯ�����ּ���");
			
		} else {
			byte b = (byte) i;
			System.out.println(i);
			
		}
	}

}
