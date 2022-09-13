package section.exam18;

public class Television {
	
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	String color;
	
	
	
	static {
		info = company + "_" + model;
	}
	
	
	public static void main(String[] args) {
		System.out.println(Television.info);
	}
	
	
}
