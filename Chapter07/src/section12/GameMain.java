package section12;

public class GameMain {
	public static void main(String[] args) {
		Character ch = new Character(200,100);
		Potion Heal = new HealPotion();
		Potion Mana = new ManaPotion();
		Potion Vital = new VitalPotion();
		
		System.out.println(ch);
		
//		for (int i = 0; i < 6; i++) { //힐 물약
//			ch.usePotion(Heal);
//		}
//		System.out.println(Heal); // 마나물약
//		System.out.println("------------------------------------");
//		
//		for (int i = 0; i < 7; i++) {
//			ch.usePotion(Mana);
//		}
//		System.out.println(ch); 
//		System.out.println("------------------------------------");
	
		for (int i = 0; i < 6; i++) {
		ch.usePotion(Vital);
		}
		System.out.println(ch); //부패물약
		
	}
}
