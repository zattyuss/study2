package ArrayCreateByxxxx;

public class ArrayCreateByValueEx3 {
	public static void main(String[] args) {
		
		int[] score = {83, 90, 87, 70, 75};
		int sum = 0;
		
		for(int i=0; i< score.length; i++) {
			sum+=score[i];
		}
		System.out.println("ÃÑÇÕ : "+ sum);
		
		double avg = sum / (double)score.length;
		System.out.println("Æò±Õ : "+avg);
	}
}
