package section05;

public class ExMain {
	public static void main(String[] args) {
		System.out.println(AAA.AAA_CONST);
		AAA.st_testAAA();
		AAA.st_testAAA();
		
		AAA aaa = new Dummy();
		aaa.testAA("�ȳ�?");
		aaa.testAAA("���� �ɴϴ�...");
		aaa.de_testAA();
		aaa.de_testAAA();
	}
}
