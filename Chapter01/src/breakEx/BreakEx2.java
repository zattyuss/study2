package breakEx;

import java.util.Scanner;

public class BreakEx2 {
	public static void main(String[] args) {
		int num;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("0�� �Է��ϸ� ����");
		while(true) {
			System.out.print(">>");
			num = scan.nextInt();
			
			if(num==0) break;
			sum+=num;
		}
		System.out.println("�հ� : " + sum);
		System.out.println("���α׷� ����");
	}
}
