package section01;

import java.util.Scanner;

public class StarEx6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("피라미드의 층을 입력하세요>>");
		int floor = scan.nextInt();
		
		for(int i=1; i<=floor; i++) {
			for(int j=1; j<=1-1; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=-2*i+(floor*2+1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
