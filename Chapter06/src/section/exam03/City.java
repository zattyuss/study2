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
		System.out.println("�����ڷ� " + name + " ��ü�� �����մϴ�.");
		
	}
	
public void setTax() {
	 if(!isBuilding) {    // �ǹ��� ���� �� ���� ���
		 tax = name.equals("����") ? price*2 : (int)(price*1.2);  // �ǹ��� ���� ���
		 		return;
	}
	 if(ownedBuilding==null) {   // �ǹ��� �ִ� ���
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
