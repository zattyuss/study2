package section.exam24;

public class BoardMain {
	public static void main(String[] args) {
		Board board = new Board();
		board.setId(1);
		board.setTitle("제목입니다.");
		board.setContents("게시글 내용입니다.");
		board.setWriter("홍길동");
		
		System.out.println(board.getId());
		System.out.println(board.getTitle());
		System.out.println(board.getContents());
		System.out.println(board.getWriter());
	}
}
