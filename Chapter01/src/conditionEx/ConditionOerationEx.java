package conditionEx;

import java.util.Scanner;

public class ConditionOerationEx {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ��� >>");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		String result = score > 60 ? "�հ�" : "���հ�";
		System.out.println(result);

	}

}
