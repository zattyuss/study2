package section01;

import java.util.Scanner;

public class IfElseStratmentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("������ �Է��ϼ���>>");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if(score > 60) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}
	}

}
