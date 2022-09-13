package section01;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		ifElseTest(score);
	}
	
	public static void ifElseTest(int score) {
		if(score>=90) {
			System.out.println("점수는 90점 이상입니다.");
			System.out.println("등급은 A등급입니다.");
			return;
		}
		System.out.println("점수는 90점 미만입니다.");
		System.out.println("등급은 B등급입니다.");
	}
	
}
