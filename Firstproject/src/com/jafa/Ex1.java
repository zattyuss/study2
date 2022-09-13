package com.jafa;

public class Ex1 {
	public static void main(String[] args) {
		int start = 1;
		int end = 6;
		int range = end-start+1;
		
		int num1=0, num2=0, num3=0;
		while (num1==num2 || num2==num3 || num3==num1){
			num1 = (int) ((Math.random()*range)+start);
			num2 = (int) ((Math.random()*range)+start);
			num3 = (int) ((Math.random()*range)+start);
		}
		System.out.println("생성된 임의의 수 : "+ num1 +", " + num2 + ", " + num3 );
	}
}
