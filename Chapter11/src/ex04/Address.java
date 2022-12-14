package ex04;

public class Address {
	private String state; //?õ?
	private String city; // ???鱸????
	private int zip; //??????ȣ
	//?????ϵ? ?????? ??ǳ??
	//?뱸?????? ?ϱ?
	
	
	public Address(String state, String city, int zip) {
		super();
		this.state = state;
		this.city = city;
		this.zip = zip;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getZip() {
		return zip;
	}


	public void setZip(int zip) {
		this.zip = zip;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Address) {
			Address addr =  (Address) obj;
			return state.equals(addr.getState())&&
					city.equals(addr.getCity()) &&
					zip == addr.getZip();
		}
		return false;
	}
	
}
