package com.jafa;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����Է� >>");
		int score = scan.nextInt();
	
		
		if(score>=90) {
			System.out.println("���� : 90�� �̻�");
			System.out.println("��� : A");
		}else if(score>=80){
			System.out.println("���� : 80�� �̻�");
			System.out.println("��� : B");
		}else if(score>=70){
			System.out.println("���� : 70�� �̻�");
			System.out.println("��� : C");
		}else {
			System.out.println("���� : 70�� �̸�");
			System.out.println("��� : D");
		}
	}	
}
