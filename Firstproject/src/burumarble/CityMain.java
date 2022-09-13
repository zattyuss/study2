package burumarble;

public class CityMain {
	public static void main(String[] args) {
		
		City seoul = new City("서울", 1000000, false);
		City busan = new City("부산", 600000, false);
		City roma = new City("로마", 320000, true);
		System.out.println(seoul);		
		System.out.println(roma);
		
		seoul.setTax();
		System.out.println("서울 : "+seoul.getTax());
		
		busan.setTax();
		System.out.println("부산 : "+busan.getTax());
		
		roma.setTax();
		System.out.println("로마 : "+ roma.getTax());
		
		roma.setOwnedBuilding("villa");
		roma.setTax();
		System.out.println("로마 : "+ roma.getTax());
		
		roma.setOwnedBuilding("building");
		roma.setTax();
		System.out.println("로마 : "+ roma.getTax());
		
		roma.setOwnedBuilding("hotel");
		roma.setTax();
		System.out.println("로마 : "+ roma.getTax());
		
		
		
		
		
		
		
	}
}
