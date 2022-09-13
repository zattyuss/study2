package com.jafa;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요 >>");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		String case1 = "점수는 90점 이상\n등급 : A등급";
		String case2 = "점수는 90점 미만\n등급 : B등급";
		String message = score >= 90 ? case1 : case2;
		System.out.println(message);
		}
	
}
