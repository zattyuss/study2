import java.util.Scanner;

public class SwitchEx2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ð��Է� >>");
		int time = scan.nextInt();
		System.out.println("���� �ð� : "+ time +"��");
		
		switch(time){
			case 8:
				System.out.println("����� �մϴ�.");
			case 9:
				System.out.println("ȸ�Ǹ� �մϴ�.");
			case 10:
				System.out.println("������ ���ϴ�.");
			default:
				System.out.println("�ܱ��� �����ϴ�.");
				
		}
	}
}
