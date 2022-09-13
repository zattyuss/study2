package section.exam10;

public class Computer {
	int sum1(int [] values) {
		int sum = 0;
		for(int e : values) {
			sum += e;
		}
		return sum;
	}
	
	int sum2(int ... values) {
		
			int sum = 0;
			for(int e : values) {
				sum += e;
			}
			return sum;
	}
	
}
