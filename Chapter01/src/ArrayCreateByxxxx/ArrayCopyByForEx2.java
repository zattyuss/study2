package ArrayCreateByxxxx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCopyByForEx2 {
	public static void main(String[] args) {
		
		int[] score = {70,75,90,91};
		int[] newScore = new int[6];
		for(int i=0; i<score.length; i++) {
			newScore[i] = score[i];
		}
		System.out.println(Arrays.toString(newScore));
		
		newScore[4] = 100;
		newScore[5] = 95;
		System.out.println(Arrays.toString(newScore));
		
		List<Integer> list = Arrays.asList(70,75,90,91);
		List<Integer> scores = new ArrayList<Integer>(list);
		System.out.println(scores);
		
		scores.add(100);
		scores.add(95);
		System.out.println(scores);
		
	}
}
