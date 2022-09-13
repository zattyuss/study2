package com.jafa;

import java.awt.Checkbox;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		boolean result1 = checkRandomValue(3,7,8);
		boolean result2 = checkRandomValue(4,11,11);
		boolean result3 = checkRandomValue(4,11,4);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

	public static boolean checkRandomValue(int start, int end, int value) {
		int range = end-start+1;
		for(int i=0; i<=10; i++) {
			int test=(int)(Math.random()*range)+start;
			if(test!=value) continue;
			return true;
		}
		return false;
	}
}
