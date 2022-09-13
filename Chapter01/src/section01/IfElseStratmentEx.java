package section01;

import java.util.Scanner;

public class IfElseStratmentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("정수를 입력하세요>>");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if(score > 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}

}
