package arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest2 {
	public static void main(String[] args) {
		String[] names = {"�̳���","������","�̳���","�Ǹ���"};
		System.out.println(Arrays.toString(names));
		names[1] = null;
		System.out.println(Arrays.toString(names));
		
		
		List<String> list = Arrays.asList("�̳���","������","�̳���","�Ǹ���");
		ArrayList<String> names2 = new ArrayList<String>(list);
		
		System.out.println(names2);
		
		// ������
		names2.remove(1);
		System.out.println(names2);
		// 
		names2.set(0, "�Ǹ���");
		System.out.println(names2);
		// �߰�
		names2.add("�Ѹ�");
		System.out.println(names2);
		
	}
}
