import java.util.Scanner;

public class SwitchCharEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����Է� >> ");
		String nextLine = scan.nextLine();
		if(nextLine.length()!=1) {
			System.out.println("�� ���ڸ� �Է��ϼ���");
			return;
		}
		char grade = nextLine.charAt(0);
//		boolean lowerTest = (grade>=97 && grade<=122) ? true : false;
//		boolean upperTest = (grade>=65 || grade<=90) ? true : false;
//		
//		if( lowerTest && upperTest) {                                        ���̶� ���� ����
//		System.out.println("�����ڷ� �Է��ϼ���");
//		return;
//	}
		boolean lowerTest = (grade<97 || grade>122) ? true : false;
		boolean upperTest = (grade<65 || grade>90) ? true : false;
		
		if( !(lowerTest || upperTest)) {
			System.out.println("�����ڷ� �Է��ϼ���");
			return;
		}
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("���ȸ�� �Դϴ�.");
				break;
			case 'B':
			case 'b':
				System.out.println("�Ϲ�ȸ�� �Դϴ�.");
				break;
			default:
				System.out.println("�մ��Դϴ�.");
		}
	}
}
