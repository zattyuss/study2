package ex01;

public class Example02 {
	public static void main(String[] args) {
		String str1 = "홍길동"; //객체 생성
		String str2 = "홍길동"; //객체 생성 x
		String str3 = new String("홍길동");
		
		System.out.println(str1 == str2); //주소값 비교
		System.out.println(str1.equals(str2)); // 객체에 저장된 값 비교
		//논리적 동등 : 객체에 저장된 값이 모두 같을 때
		
		// str2 와 str3는 서로 다른 객체
		System.out.println(str2 == str3);
		
		// str2 와 str3는 논리적 동등이다 
		System.out.println(str2.equals(str3));
		
		
	}
}
