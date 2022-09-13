package section01;

public class WhileSumEx2 {
	public static void main(String[] args) {
		int sum= 0;
		int i=0;
		
		while((sum += ++i)<=100) {
			System.out.println(i + "-" + "누적 합계 :" + sum);
		}
	}
}
