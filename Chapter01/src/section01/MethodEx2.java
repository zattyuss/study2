package section01;

public class MethodEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("AA�޼ҵ� ����");
		methodAA();
		
		System.out.println("���θ޼ҵ� ����");
		
	}
	
	public static void methodAA( ) {
		System.out.println("methodAA����");
		methodBB();
	}
	
	public static void methodBB( ) {
		System.out.println("method����");
	}
}
