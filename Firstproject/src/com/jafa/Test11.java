package com.jafa;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수입력 >>");
		int score = scan.nextInt();
	
		
		if(score>=90) {
			System.out.println("점수 : 90점 이상");
			System.out.println("등급 : A");
		}else if(score>=80){
			System.out.println("점수 : 80점 이상");
			System.out.println("등급 : B");
		}else if(score>=70){
			System.out.println("점수 : 70점 이상");
			System.out.println("등급 : C");
		}else {
			System.out.println("점수 : 70점 미만");
			System.out.println("등급 : D");
		}
	}	
}
