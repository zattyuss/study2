package com.jafa;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ��� >>");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		String case1 = "������ 90�� �̻�\n��� : A���";
		String case2 = "������ 90�� �̸�\n��� : B���";
		String message = score >= 90 ? case1 : case2;
		System.out.println(message);
		}
	
}
