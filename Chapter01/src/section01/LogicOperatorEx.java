package section01;

import java.util.Scanner;

public class LogicOperatorEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���>>" );
		String nickName = scan.nextLine();
		
		boolean minTest = nickName.length() >= 3;
		boolean maxTest = nickName.length() <= 5;
		
		if(minTest && maxTest) { //AND ������
			System.out.println("������ �ԷµǾ����ϴ�.");
			System.out.println("�Է� �� ���� : "+ nickName);
			return; //���� �޼ҵ� ����
		}
		System.out.println("������ 3���� ~ 5���ڷ� �Է��ϼ���");
				
	}

}
