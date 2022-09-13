import java.util.Scanner;

public class IfNestedEx {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요 >>");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		String grade;
		
		if(score >= 90) {
			grade = score >=95 ? "A+" : "A";
		} else {
			grade = score >=85 ? "B+" : "B";
			
		}
		System.out.println("학점 : "+ grade);
	}
}
