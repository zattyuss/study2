package compareEx;

import java.util.Scanner;

public class CompareOperatorEx {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù ��° �� �Է�>>");
		int inputInt1 = scan.nextInt();
		
		System.out.println("�� ��°�� ��° �� �Է�>>");
		int inputInt2 = scan.nextInt();
		
		if(inputInt1==inputInt2) {
			System.out.println("�� �Է°��� ����.");
		}
		if(inputInt1!=inputInt2) {
			System.out.println("�� �Է°��� ���� �ٸ���.");
		}
		if(inputInt1>=inputInt2) {
			System.out.println("ù ��° �Է°��� �� ũ��.");
		}
		if(inputInt1<=inputInt2) {
			System.out.println("�� ��° �Է°��� �� �۴�");
		}
		

	}

}
