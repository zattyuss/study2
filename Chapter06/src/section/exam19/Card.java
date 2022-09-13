package section.exam19;

public class Card {
	
	int cardNumber;
	static int cardwidth;
	static int cardheight;
	
	static {
		 cardwidth = 10;
		 cardheight = 12;
	}
	public Card(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public void infoCardSize() {
		System.out.println(cardwidth);
		System.out.println(cardheight);
		
	}
	private void info() {
		System.out.println("카드 클래스입니다.");
	}
	int getCardNumber() {
		info();
		System.out.println("cardwidth :" + cardheight);
		return this.cardNumber;
	}
	
	
}
