import java.util.Scanner;

public class Break0 {
	public static void main(String[] args) {
		int num;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("0을 입력하면 종료");
		while(true) {
			System.out.println(">>");
			num = scan.nextInt();
			
			if(num==0) break;
			
			sum+=num;
		}
		System.out.println("합계 : " + sum);
		System.out.println("프로그램 종료");
	}
}	
