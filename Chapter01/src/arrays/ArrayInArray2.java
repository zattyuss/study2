package arrays;

public class ArrayInArray2 {
	public static void main(String[] args) {
		String[][] players = {
				{"������","�迵��","�����","ȫö"},
				{"���缺","Ȳ�ι�","������"},
				{"������","��"},
				{"���θ�"}
		};
		
		for(int i=0; i<players.length; i++) {
			for(int j=0; j<players[i].length; j++) {
				System.out.println((players[i][j]));
			}
		}
	}
}
