package section01;

public class StringEqualsDemo {

	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = new String("ȫ�浿");
		                               
		System.out.println(str1==str2); //false
		
		boolean isEquals = str1.equals(str2); // str1�� ���� str2�� ���� ����?
		System.out.println(isEquals);

	}

}
