package calculator;

public class Computer {
	
	int sum(int[] values) {
		int total = 0;
		for(int value : values) {
			total += value;
		}
		return total;
	}

	public int sum2(int ... values) {
			int total = 0;
			for(int value : values) {
				total += value;
			}
			return total;
		}	
}
