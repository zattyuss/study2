package ex05;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("국어", 1);
		map.put("영어", 11);
		map.put("수학", 12);
		map.put("과학", 13);
		map.put("사회", 14);
		System.out.println(map);
		
		System.out.println("국어점수 : " + map.get("국어"));
		System.out.println("영어점수 : " + map.get("영어"));
		System.out.println("수학점수 : " + map.get("수학"));
		System.out.println("과학점수 : " + map.get("과학"));
		System.out.println("사회점수 : " + map.get("사회"));
		
		
	}
}
