package section01;

import java.util.Scanner;

public class IfNestedEx {

	public static void main(String[] args) {

		System.out.println("������ �Է��ϼ��� >>");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if(score>=85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		System.out.println("���� : "+ grade);

	}

}
