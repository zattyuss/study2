package ArrayCreateByxxxx;

public class ArrayInArrayEx2 {
	public static void main(String[] args) {
		String[][] players = {
				{"������","�迵��","������","ȫö"},
				{"���缺","Ȳ�ι�","��â��"},
				{"�̵���","�����"},
				{"Ȳ����"}
		};
		/*System.out.println(players[3][0]);
		*System.out.println(players[0][2]);
		*System.out.println(players[1][0]);
		*System.out.println(players[0][0]);
		*/
		for(int i=0; i<players.length; i++) {
			for(int j=0; j<players[i].length; j++) {
				System.out.println(players[i][j]);
			}
		}
	}
}
