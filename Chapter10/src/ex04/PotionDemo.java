package ex04;

public class PotionDemo {
	public static void main(String[] args) {
		Potion healPotion = new HealPotion();
		Potion manaPotion = new ManaPotion();
		healPotion.recovery();
		manaPotion.recovery();
		
		((HealPotion) healPotion).sayHello();
		((ManaPotion) manaPotion).sayYes();
		
		ManaPotion mana = (ManaPotion) healPotion;
		
	}


}

interface Potion{
	void recovery();
}

class HealPotion implements Potion{

	@Override
	public void recovery() {
		System.out.println("������");
	}
	public void sayHello() {
		System.out.println("Hello");
	}
}

class ManaPotion implements Potion{

	@Override
	public void recovery() {
		System.out.println("��������");
	}
	public void sayYes() {
		System.out.println("Yes");
	}
}