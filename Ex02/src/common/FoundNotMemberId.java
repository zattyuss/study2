package common;

public class FoundNotMemberId extends RuntimeException { // 실행예외
	
	//일반예외 : 컴파일 과정에서 발생
	//실행예외 : 실행 과정에서 발생
	public FoundNotMemberId(String message) {
		super(message);
	}
}
