import java.util.Scanner;

public class Break0 {
	public static void main(String[] args) {
		int num;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("0�� �Է��ϸ� ����");
		while(true) {
			System.out.println(">>");
			num = scan.nextInt();
			
			if(num==0) break;
			
			sum+=num;
		}
		System.out.println("�հ� : " + sum);
		System.out.println("���α׷� ����");
	}
}	
