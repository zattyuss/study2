package section01;

public class IncDecEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1 = 10;
		int y1 = 10;
		int result1 = ++x1 +5; // 16 x1값 1 증가후 5와 덧셈 연산
		int result2 = y1++ +5; // 15 y1값과 5 덧셈 연산후 y1값 증가
		System.out.println("전위증가:"+result1);
		System.out.println("후위증가:"+result2);
		
		
		
		
		
		
		int x =10;
		int y =10;
		
		System.out.println(++x); //x값이 1증가하여 11에 출력된다.
		System.out.println(y++); //10이 출력되고 y의 값이 1증가한다.
		
		System.out.println("x="+x);
		System.out.println("y="+y);
	
	}

}
