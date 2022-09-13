package arrays;

public class ArrayCreateByValueListEx {
	public static void main(String[] args) {
		int total = addAll(new int []{100,200,300,400});
		System.out.println("гу╟Х : "+total);
		
	}

	private static int addAll(int[] scores) {
		int sum = 0;
		for(int value : scores) {
			sum+=value;
		
		}
		return sum;
	}
}
