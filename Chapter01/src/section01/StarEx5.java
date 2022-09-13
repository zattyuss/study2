package section01;

public class StarEx5 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=-2*i+11; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
