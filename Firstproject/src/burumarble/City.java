package burumarble;

public class City {
	private String name;
	private String owner;
	private int price;
	private boolean isBuilding;
	private String ownedBuilding;
	private int tax;
	
	
	public City(String name, int price, boolean isBuilding) {
		this.name = name;
		this.price = price;
		this.isBuilding = isBuilding;
	}
		//건물을 지을 수 없는 경우
	public void setTax() {
		if(!isBuilding) {
			tax = name.equals("서울") ? price*2 : (int)(price*1.2);
			return;
		}
		//건물을 지을 수 있는 경우
		if(ownedBuilding==null) {
			tax = (int) (price*0.1);
			return;
		}
		switch(ownedBuilding) {
		case "villa":
			tax = (int) (price*0.8);
			break;
		case "building":
			tax = price + 600000;
			break;
		case "hotel":
			tax = price + 1000000;
			break;
		}
		
		
		
		
	}

	public int getTax() {
		return tax;
	}
	public String getOwnedBuilding() {
		return ownedBuilding;
	}
	public void setOwnedBuilding(String ownedBuilding) {
		this.ownedBuilding = ownedBuilding;
	}
	
}
