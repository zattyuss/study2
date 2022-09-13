package ex07;

import java.util.Scanner;

public class FinallyTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(">> 회원번호 입력 : ");
		
		try {
			String inputValue = scan.nextLine();
			int id = Integer.parseInt(inputValue);
			System.out.println("입력한 회원 번호 : " + id);
			return;
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
		} finally {
			// 예외가 발생 여부에 관계없이 반드시 이 블록이 실행된다.
			// return문이 실행되더라 finally블록 실행 후 메소드를 종료한다.
			scan.close();
			System.out.println("모든 리소스를 변환합니다.");
		}
	}
}
