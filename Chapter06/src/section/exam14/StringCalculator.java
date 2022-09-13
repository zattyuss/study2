package section.exam14;

public class StringCalculator {

	public int add(int ja, int va) {
		return ja+va;
	}

	public int add(String ja, String fa) {
		int num1;
		int num2;
		try {
			num1 = Integer.parseInt(ja);
			num2 = Integer.parseInt(fa);
			return num1+num2;
			
		}catch(NumberFormatException e) {
			System.out.println("올바른 값을 입력하세요");
			return 0;
		}
		
		
		
		
	}
	

}
