package ex05;

import java.util.Iterator;

public class ExcptionHandling {
	public static void main(String[] args) {
		
		System.out.println("�ε� �� :");
		for (int i = 1; i < 100; i++) {
			try {
				Thread.sleep(20);
				System.out.print(">");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("100% \n ���α׷� ����");
	}
}