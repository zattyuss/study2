package section01;

public class SwitchEx {

	public static void main(String[] args) {
		
		int num = (int) (Math.random()*6)+1;
		
		switch (num) {
		case 1:
			System.out.println("1의 눈이 나왔습니다.");
			break;
		case 2:
			System.out.println("2의 눈이 나왔습니다.");
			break;
		case 3:
			System.out.println("3의 눈이 나왔습니다.");
			break;
		case 4:
			System.out.println("4의 눈이 나왔습니다.");
			break;
		case 5:
			System.out.println("5의 눈이 나왔습니다.");
			break;
		default:
			System.out.println("6의 눈이 나왔습니다.");
			break;
		}

	}

}
