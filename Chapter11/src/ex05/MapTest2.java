package ex05;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("����", 1);
		map.put("����", 11);
		map.put("����", 12);
		map.put("����", 13);
		map.put("��ȸ", 14);
		System.out.println(map);
		
		System.out.println("�������� : " + map.get("����"));
		System.out.println("�������� : " + map.get("����"));
		System.out.println("�������� : " + map.get("����"));
		System.out.println("�������� : " + map.get("����"));
		System.out.println("��ȸ���� : " + map.get("��ȸ"));
		
		
	}
}