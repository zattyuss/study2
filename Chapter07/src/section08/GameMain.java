package section08;

public class GameMain {
	public static void main(String[] args) {
		Hero h = new LanceMaster(); // ���� ����Ÿ��
		//�θ�Ÿ���� ���������δ� �θ�Ÿ�Կ� ����� �޼ҵ常 ����� �� �ִ�.
		h.attack();
		h.move();
		
		// �ڽ� Ŭ������ �������̵� �� �޼ҵ尡 �ִٸ� 
		h.useUlt(); // �������̵� �� �޼ҵ� �����!!!!
		
		
		LanceMaster h2 = new LanceMaster(); // �ڽ��� ����Ÿ��
		h2.attack();
		h2.move();
		h2.useUlt();
		h2.infoLanceMaster();
	}
}
