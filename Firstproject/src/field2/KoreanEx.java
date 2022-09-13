package field2;

public class KoreanEx {
	public static void main(String[] args) {
		Korean k1 = new Korean("±èÃ¶¼ö "," 920510-1684015");
		Korean k2 = new Korean("±è¿µÈñ "," 920510-2684015");
		
		System.out.println(k1.name);
		System.out.println(k2.name);
		System.out.println(k1.toString());
		System.out.println(k1);     // k1.toString()
		
	}
}
