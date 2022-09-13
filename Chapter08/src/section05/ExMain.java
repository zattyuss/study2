package section05;

public class ExMain {
	public static void main(String[] args) {
		System.out.println(AAA.AAA_CONST);
		AAA.st_testAAA();
		AAA.st_testAAA();
		
		AAA aaa = new Dummy();
		aaa.testAA("안녕?");
		aaa.testAAA("잠이 옵니다...");
		aaa.de_testAA();
		aaa.de_testAAA();
	}
}
