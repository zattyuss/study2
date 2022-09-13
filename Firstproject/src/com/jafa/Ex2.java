package com.jafa;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(">>정수값 입력 : ");
		int value = scan.nextInt();
		
		int sum = 0;
		while(value!=0 ) {
			sum += value%10;
			value=value/10;
		}
		System.out.println(sum);
	}
}
