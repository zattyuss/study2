package section01;

public class MainStringArrayArgumentEx {
	public static void main(String[] args) {
		
		if(args.length!=2) {
			System.out.println("���α׷� ����");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println("���޵� �� ���� �� : "+(num1+num2));
	}
}
