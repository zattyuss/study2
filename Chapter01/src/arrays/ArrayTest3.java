package arrays;

public class ArrayTest3 {
	public static void main(String[] args) {
		
		int[] scores = {83, 90, 87, 70, 75};
		
//		for(int i = 0; i< scores.length; i++) {
//			int value = scores[i];
//			System.out.println(scores[i]);
//		}
		
		for(int e : scores) {
			System.out.println(e);
		}
		
		String[] names;
		names = new String[]{"김길동","박길동","고길동"};
	}
}
