package arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest2 {
	public static void main(String[] args) {
		String[] names = {"이나브","아제나","이난나","실리안"};
		System.out.println(Arrays.toString(names));
		names[1] = null;
		System.out.println(Arrays.toString(names));
		
		
		List<String> list = Arrays.asList("이나브","아제나","이난나","실리안");
		ArrayList<String> names2 = new ArrayList<String>(list);
		
		System.out.println(names2);
		
		// 삭제후
		names2.remove(1);
		System.out.println(names2);
		// 
		names2.set(0, "실리안");
		System.out.println(names2);
		// 추가
		names2.add("둘리");
		System.out.println(names2);
		
	}
}
