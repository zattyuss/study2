package section.exam24;

public class BoardMain {
	public static void main(String[] args) {
		Board board = new Board();
		board.setId(1);
		board.setTitle("�����Դϴ�.");
		board.setContents("�Խñ� �����Դϴ�.");
		board.setWriter("ȫ�浿");
		
		System.out.println(board.getId());
		System.out.println(board.getTitle());
		System.out.println(board.getContents());
		System.out.println(board.getWriter());
	}
}
