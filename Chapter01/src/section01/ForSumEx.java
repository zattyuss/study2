package section01;

public class ForSumEx {

	public static void main(String[] args) {

		int sum = 0;
		int i = 1;
		
		for(; i<=100; i++) {
			sum +=i;
		}
		System.out.println("1부터" + (i-1) + "까지의 합 :" +sum);
	}

}
