package ArrayCreateByxxxx;

public class ArrayInArrayEx2 {
	public static void main(String[] args) {
		String[][] players = {
				{"±èÁø¼ö","±è¿µ±Ç","±èÇöÀç","È«Ã¶"},
				{"ÀÌÀç¼º","È²ÀÎ¹ü","±ÇÃ¢ÈÆ"},
				{"ÀÌµ¿°æ","¼ÕÈï¹Î"},
				{"È²ÀÇÁ¶"}
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
