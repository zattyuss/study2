import java.util.Scanner;

public class SwitchStringEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� >> ");
		String position = scan.nextLine();
		
		switch(position) {
			case "����":
				System.out.println("700����");
				break;
			case "����":
				System.out.println("500����");
				break;
			default:
				System.out.println("300����");
				break;
		}
	}
}
