package section01;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ��� >>");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if(score >= 90)
			System.out.println("������ 90�� �̻��Դϴ�.");
		
		if(score < 90)
			System.out.println("������ 90�� �̸��Դϴ�.");
		
		System.out.println("if���� ������� ���๮");

	}

}
