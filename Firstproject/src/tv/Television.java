package tv;

public class Television {
	static String company ="LG";
	static String model ="LED";
	static String info;
	String color;
	
	// ����ƽ(�޼ҵ�) ����, �� ����(��ü), ���ÿ���
	
	static {
		System.out.println("����ƽ ���");
		info = company + "_" + model;
	}
	
}
