import java.util.Scanner;

public class SwitchCharEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("등급입력 >> ");
		String nextLine = scan.nextLine();
		if(nextLine.length()!=1) {
			System.out.println("한 글자만 입력하세요");
			return;
		}
		char grade = nextLine.charAt(0);
//		boolean lowerTest = (grade>=97 && grade<=122) ? true : false;
//		boolean upperTest = (grade>=65 || grade<=90) ? true : false;
//		
//		if( lowerTest && upperTest) {                                        밑이랑 같은 거임
//		System.out.println("영문자로 입력하세요");
//		return;
//	}
		boolean lowerTest = (grade<97 || grade>122) ? true : false;
		boolean upperTest = (grade<65 || grade>90) ? true : false;
		
		if( !(lowerTest || upperTest)) {
			System.out.println("영문자로 입력하세요");
			return;
		}
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("우수회원 입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반회원 입니다.");
				break;
			default:
				System.out.println("손님입니다.");
		}
	}
}
