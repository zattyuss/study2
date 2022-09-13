package arrays;

public class ArrayInArray2 {
	public static void main(String[] args) {
		String[][] players = {
				{"김진수","김영권","김민재","홍철"},
				{"이재성","황인범","차범근"},
				{"박지성","손"},
				{"차두리"}
		};
		
		for(int i=0; i<players.length; i++) {
			for(int j=0; j<players[i].length; j++) {
				System.out.println((players[i][j]));
			}
		}
	}
}
