package charEx;

public class CharEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		int uniCode = c1; // 유니코드 얻기
		
		// 'A'
		System.out.println(c1);
		System.out.println(c2);		
		System.out.println(c3);
		// '가'
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		System.out.println(uniCode); //'가'에 해당하는 유니코드값 출력
	}

}
