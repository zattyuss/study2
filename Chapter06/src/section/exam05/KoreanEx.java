package section.exam05;

public class KoreanEx {
	public static void main(String[] args) {
		Korean k1 = new Korean("��ö��", "920510-1684015");
		Korean k2 = new Korean("�迵��", "920510-2684015");
		System.out.println("���� : "+ k1.nation + ", �̸� : " + k1.name + ", �ֹε�Ϲ�ȣ : "+ k1.ssn);

		System.out.println("���� : "+ k2.nation + ", �̸� : " + k2.name + ", �ֹε�Ϲ�ȣ : "+ k2.ssn);
		
		
	}
}
