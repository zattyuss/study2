package section01;

import java.util.Scanner;

public class IfElseIfElseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ �Է��ϼ��� >>");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if(score >= 90) {
			System.out.println("������ 90�� �̻��Դϴ�.");
			System.out.println("����� A��� �Դϴ�");
		} else if(score >=80) {
			System.out.println("������ 80�� �̻��Դϴ�.");
			System.out.println("����� B��� �Դϴ�.");
		} else if(score >=70) {
			System.out.println("������ 70�� �̻��Դϴ�.");
			System.out.println("����� C��� �Դϴ�.");
		} else {
			System.out.println("������ 70�� �̸��Դϴ�.");
			System.out.println("����� D��� �Դϴ�.");
		}
	}

}
