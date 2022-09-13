package section.exam03;

public class City {
	String name;
	String owner;
	int price;
	boolean isBuilding;
	String ownedBuilding;
	private int tax;
	
	public City(String n, int p, boolean isB) {
		name = n;
		price = p;
		isBuilding = isB;
		System.out.println("생성자로 " + name + " 객체를 생성합니다.");
		
	}
	
public void setTax() {
	 if(!isBuilding) {    // 건물을 지을 수 없는 경우
		 tax = name.equals("서울") ? price*2 : (int)(price*1.2);  // 건물이 없는 경우
		 		return;
	}
	 if(ownedBuilding==null) {   // 건물이 있는 경우
		 tax = (int) (price*0.1);
		 return;
	 }
	 switch(ownedBuilding) {
	 case "villa":
		 tax = (int) (price*0.+8);
		 break;
	 case "builing" :
		 tax = price+600000;
		 break;
	 case "hotel" :
		 tax = price+1000000;
		 break;
	 }
	}
	public int getTax() {
		return tax;
	}
}
