import java.util.Scanner;

public class SwitchEx2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("시간입력 >>");
		int time = scan.nextInt();
		System.out.println("현재 시간 : "+ time +"시");
		
		switch(time){
			case 8:
				System.out.println("출근을 합니다.");
			case 9:
				System.out.println("회의를 합니다.");
			case 10:
				System.out.println("업무를 봅니다.");
			default:
				System.out.println("외근을 나갑니다.");
				
		}
	}
}
