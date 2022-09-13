package ex07;

import java.util.Scanner;

public class FinallyTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(">> ȸ����ȣ �Է� : ");
		
		try {
			String inputValue = scan.nextLine();
			int id = Integer.parseInt(inputValue);
			System.out.println("�Է��� ȸ�� ��ȣ : " + id);
			return;
		} catch (NumberFormatException e) {
			System.out.println("���ڸ� �Է��ϼ���");
		} finally {
			// ���ܰ� �߻� ���ο� ������� �ݵ�� �� ����� ����ȴ�.
			// return���� ����Ǵ��� finally��� ���� �� �޼ҵ带 �����Ѵ�.
			scan.close();
			System.out.println("��� ���ҽ��� ��ȯ�մϴ�.");
		}
	}
}
