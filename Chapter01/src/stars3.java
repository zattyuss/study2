import java.util.Scanner;

public class stars3 {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">>");
			inputString = scan.nextLine();
			System.out.println("입력한 값 : "+ inputString);
		}while(!inputString.equals("q"));
		System.out.println("프로그램을 종료합니다.");
		}
	
}

