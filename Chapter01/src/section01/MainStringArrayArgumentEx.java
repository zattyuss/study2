package section01;

public class MainStringArrayArgumentEx {
	public static void main(String[] args) {
		
		if(args.length!=2) {
			System.out.println("프로그램 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println("전달된 두 수의 합 : "+(num1+num2));
	}
}
