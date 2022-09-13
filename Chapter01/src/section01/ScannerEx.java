package section01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		System.out.println("값을 입력하세요 >>  ");
		String inputValue = scan.nextLine();
		
		System.out.println("입력한 값: "+ inputValue);
		

	}

}
