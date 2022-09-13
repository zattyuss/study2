package section.exam05;

public class KoreanEx {
	public static void main(String[] args) {
		Korean k1 = new Korean("김철수", "920510-1684015");
		Korean k2 = new Korean("김영희", "920510-2684015");
		System.out.println("국적 : "+ k1.nation + ", 이름 : " + k1.name + ", 주민등록번호 : "+ k1.ssn);

		System.out.println("국적 : "+ k2.nation + ", 이름 : " + k2.name + ", 주민등록번호 : "+ k2.ssn);
		
		
	}
}
