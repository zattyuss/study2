package section01;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		ifElseTest(score);
	}
	
	public static void ifElseTest(int score) {
		if(score>=90) {
			System.out.println("������ 90�� �̻��Դϴ�.");
			System.out.println("����� A����Դϴ�.");
			return;
		}
		System.out.println("������ 90�� �̸��Դϴ�.");
		System.out.println("����� B����Դϴ�.");
	}
	
}
