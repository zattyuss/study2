package section01;

import java.util.Scanner;

public class ValueOfEx2 {

	public static void main(String[] args) {
		
		System.out.println("금액을 입력하세요>>");
		Scanner scan = new Scanner(System.in);
		
		String inputValue = scan.nextLine();
		
		try {
			double val = Double.valueOf(inputValue);
			double currentBalance = 1000.0;
			if(!Double.isNaN(val)){
				currentBalance = currentBalance + val;
				System.out.println(val + "원 입금");
				System.out.println("잔액 "+ currentBalance);
				return;
			}
			System.out.println("NaN : 올바른 입력값이 아닙니다");
			
		} catch (NumberFormatException e) {
			System.out.println("예외 발생 : 올바른 입력값이 아님 ");
		}
		
	}
	
}
