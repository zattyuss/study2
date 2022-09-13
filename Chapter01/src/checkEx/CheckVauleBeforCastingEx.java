package checkEx;

public class CheckVauleBeforCastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 120;
		
		if( i< Byte.MIN_VALUE ||  i > Byte.MAX_VALUE) {
			System.out.println("byte 타입으로 변환 할 수 없음");
			System.out.println("값을 다시 확인해주세요");
			
		} else {
			byte b = (byte) i;
			System.out.println(i);
			
		}
	}

}
