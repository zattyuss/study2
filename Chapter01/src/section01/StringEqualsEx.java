package section01;

public class StringEqualsEx {
	public static void main(String[] args) {
		String strVa1 = "�Ź�ö";
		String strVa2 = "�Ź�ö";
		String strVa3 = new String("�Ź�ö");
		String strVa4 = new String("�Ź�ö");
		isRefEquals(strVa1, strVa2);
		isRefEquals(strVa2, strVa3);
		isRefEquals(strVa3, strVa4);
		
		isValueEquals(strVa1, strVa2);
		isValueEquals(strVa2, strVa3);
		isValueEquals(strVa3, strVa4);
	}
	
	
	public static void isRefEquals(String var1, String var2) {
		if(var1 == var2) {
			System.out.println("�� ������ �������� ����.");
			return;
		}
		System.out.println("�� ������ �������� �ٸ���.");
		
		
		
	}
	public static void isValueEquals(String var1, String var2) {
		if(var1.equals(var2)) {
			System.out.println("�� ������ ���ڿ��� ����.");
			return;
		}
		System.out.println("�� ������ ���ڿ��� �ٸ���.");
	}
	
	
}
	