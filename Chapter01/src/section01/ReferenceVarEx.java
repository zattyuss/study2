package section01;

public class ReferenceVarEx {
	public static void main(String[] args) {
		String refVal1 = new String("ȫ�浿");
		String refVal2 = "ȫ�浿";
		String refVal3 = "ȫ�浿";
		
		System.out.println(refVal1 == refVal2);
		System.out.println(refVal1 != refVal2);
		System.out.println(refVal2 == refVal3);
		System.out.println(refVal2 != refVal3);
	}
}
