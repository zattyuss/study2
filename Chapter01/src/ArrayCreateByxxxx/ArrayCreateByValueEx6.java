package ArrayCreateByxxxx;

public class ArrayCreateByValueEx6 {
	public static void main(String[] args) {
		int[] scores1 = {100,90,80};
		int[] scores2 = {100,90,80,70};
		int total1 = addAll(scores1);
		int total2 = addAll(scores2);
		System.out.println("합계1 : " + total1);
		System.out.println("합계2 : " + total2);
		
//		addAll({10,20,30,40});
		int total3 = addAll (new int[] {100,100,100,100});
		System.out.println("합계3 : "+ total3);
	}
	
	
	public static int addAll(int[] scores) {
		int sum = 0;
		for(int i=0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
