package com.jafa;

public class EEx {
	public static void main(String[] args) {
		String inputStr = "2457";		
		
		int sum = 0;
		for (int i=0; i<inputStr.length(); i++) {
			int temp = inputStr.charAt(i)-'0';
			sum += temp;
		}
		System.out.println(sum);

	
		
	}
}
