package section01;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요 >>");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if(score >= 90)
			System.out.println("점수는 90점 이상입니다.");
		
		if(score < 90)
			System.out.println("점수는 90점 미만입니다.");
		
		System.out.println("if문과 관계없는 실행문");

	}

}
