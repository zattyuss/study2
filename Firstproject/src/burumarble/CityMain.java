package burumarble;

public class CityMain {
	public static void main(String[] args) {
		
		City seoul = new City("����", 1000000, false);
		City busan = new City("�λ�", 600000, false);
		City roma = new City("�θ�", 320000, true);
		System.out.println(seoul);		
		System.out.println(roma);
		
		seoul.setTax();
		System.out.println("���� : "+seoul.getTax());
		
		busan.setTax();
		System.out.println("�λ� : "+busan.getTax());
		
		roma.setTax();
		System.out.println("�θ� : "+ roma.getTax());
		
		roma.setOwnedBuilding("villa");
		roma.setTax();
		System.out.println("�θ� : "+ roma.getTax());
		
		roma.setOwnedBuilding("building");
		roma.setTax();
		System.out.println("�θ� : "+ roma.getTax());
		
		roma.setOwnedBuilding("hotel");
		roma.setTax();
		System.out.println("�θ� : "+ roma.getTax());
		
		
		
		
		
		
		
	}
}
