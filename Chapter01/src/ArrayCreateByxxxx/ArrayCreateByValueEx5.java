package ArrayCreateByxxxx;

public class ArrayCreateByValueEx5 {
	public static void main(String[] args) {
		
		int[] scores;
		scores = new int[] {100,70,50};
		for(int i=0 ; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		String[] names = {"ȫ�浿","ȫ�浿"};
		names = new String[] {"ȫ�浿","ȫ�浿"};
		for(int i=0; i<names.length; i++) {
			System.out.println(names[1]);
		}
	}
}
