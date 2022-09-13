package section01;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "조건문 블록 안에서 사용할 수 있을까?";
		if(10>5) {
		 System.out.println("실행되나?");
		 String result = "10은 5보다 크다.";
		 System.out.println(result);
		 System.out.println(str);
		}
//		System.out.println(result);
		
		
	}
	
	
}
