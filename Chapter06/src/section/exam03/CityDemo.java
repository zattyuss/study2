package section.exam03;

public class CityDemo {
	public static void main(String[] args) {
		City seoul = new City("����", 1000000, false);
		City roman = new City("�θ�", 320000, true);
		City busan = new City("�λ�", 500000, false);
		
		seoul.owner = "���缮";
		seoul.setTax();
		
		System.out.println("���� ���༼ : "+seoul.getTax());
		
		busan.owner = "�����";
		
		busan.setTax();
		System.out.println("�λ� ���༼ : "+busan.getTax());
		
		roman.owner ="������";
		roman.setTax();
		System.out.println("�θ� ���༼ : "+ roman.getTax());
		
		roman.ownedBuilding = "hotel";
		roman.setTax();
		System.out.println("�θ�(ȣ���߰�) ���༼ :  "+ roman.getTax());
		
		
//		System.out.println("�����̸� : " +seoul.name);
//		System.out.println("���԰� : " +seoul.price);
//		System.out.println("�ǹ��� ���� �� �ֳ� : " +seoul.isBuilding);
		
//		System.out.println("�����̸� : " +roman.name);
//		System.out.println("���԰� : " +roman.price);
//		System.out.println("�ǹ��� ���� �� �ֳ� : " +roman.isBuilding);
	}
}
