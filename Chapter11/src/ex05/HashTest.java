package ex05;

import java.util.HashMap;
import java.util.Map;

public class HashTest {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();	
		map.put(1, "버거킹");
		map.put(2, "맥도날드");
		map.put(3, "맘스터치");
		map.put(4, "롯데리아");
		map.put(1, "dd");
		System.out.println(map);
		
		String name = map.get(3);
		System.out.println(map.get(1));
	}
}
