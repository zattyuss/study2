package compareEx;

public class CompareOperator4 {

	public static void main(String[] args) {
		String str1 = new String("ȫ�浿");
		String str2 = new String("ȫ�浿");
		String str3 = new String("ȫ�浿");
		
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str1 == str3);
	}
}
