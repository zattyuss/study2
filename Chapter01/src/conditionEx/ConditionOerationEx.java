package conditionEx;

import java.util.Scanner;

public class ConditionOerationEx {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요 >>");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		String result = score > 60 ? "합격" : "불합격";
		System.out.println(result);

	}

}
