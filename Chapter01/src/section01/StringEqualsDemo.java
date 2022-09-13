package section01;

public class StringEqualsDemo {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = new String("홍길동");
		                               
		System.out.println(str1==str2); //false
		
		boolean isEquals = str1.equals(str2); // str1의 값과 str2의 값은 같나?
		System.out.println(isEquals);

	}

}
