package ex05;

import java.util.HashMap;
import java.util.Map;

public class HashTest {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();	
		map.put(1, "����ŷ");
		map.put(2, "�Ƶ�����");
		map.put(3, "������ġ");
		map.put(4, "�Ե�����");
		map.put(1, "dd");
		System.out.println(map);
		
		String name = map.get(3);
		System.out.println(map.get(1));
	}
}
