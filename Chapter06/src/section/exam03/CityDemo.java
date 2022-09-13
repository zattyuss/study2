package section.exam03;

public class CityDemo {
	public static void main(String[] args) {
		City seoul = new City("서울", 1000000, false);
		City roman = new City("로마", 320000, true);
		City busan = new City("부산", 500000, false);
		
		seoul.owner = "유재석";
		seoul.setTax();
		
		System.out.println("서울 통행세 : "+seoul.getTax());
		
		busan.owner = "정상수";
		
		busan.setTax();
		System.out.println("부산 통행세 : "+busan.getTax());
		
		roman.owner ="백차장";
		roman.setTax();
		System.out.println("로마 통행세 : "+ roman.getTax());
		
		roman.ownedBuilding = "hotel";
		roman.setTax();
		System.out.println("로마(호텔추가) 통행세 :  "+ roman.getTax());
		
		
//		System.out.println("도시이름 : " +seoul.name);
//		System.out.println("매입가 : " +seoul.price);
//		System.out.println("건물을 지을 수 있나 : " +seoul.isBuilding);
		
//		System.out.println("도시이름 : " +roman.name);
//		System.out.println("매입가 : " +roman.price);
//		System.out.println("건물을 지을 수 있나 : " +roman.isBuilding);
	}
}
