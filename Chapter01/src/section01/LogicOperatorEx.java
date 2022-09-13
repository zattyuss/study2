package section01;

import java.util.Scanner;

public class LogicOperatorEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("별명을 입력하세요>>" );
		String nickName = scan.nextLine();
		
		boolean minTest = nickName.length() >= 3;
		boolean maxTest = nickName.length() <= 5;
		
		if(minTest && maxTest) { //AND 연산자
			System.out.println("별명이 입력되었습니다.");
			System.out.println("입력 한 별명 : "+ nickName);
			return; //현재 메소드 종료
		}
		System.out.println("별명은 3글자 ~ 5글자로 입력하세요");
				
	}

}
