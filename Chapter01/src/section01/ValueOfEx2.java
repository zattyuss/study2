package section01;

import java.util.Scanner;

public class ValueOfEx2 {

	public static void main(String[] args) {
		
		System.out.println("�ݾ��� �Է��ϼ���>>");
		Scanner scan = new Scanner(System.in);
		
		String inputValue = scan.nextLine();
		
		try {
			double val = Double.valueOf(inputValue);
			double currentBalance = 1000.0;
			if(!Double.isNaN(val)){
				currentBalance = currentBalance + val;
				System.out.println(val + "�� �Ա�");
				System.out.println("�ܾ� "+ currentBalance);
				return;
			}
			System.out.println("NaN : �ùٸ� �Է°��� �ƴմϴ�");
			
		} catch (NumberFormatException e) {
			System.out.println("���� �߻� : �ùٸ� �Է°��� �ƴ� ");
		}
		
	}
	
}
