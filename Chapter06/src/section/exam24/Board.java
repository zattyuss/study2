package section.exam24;

import java.time.LocalDate;

public class Board {
	private int id;
	private String title;
	private String contents;
	private String writer;
	private LocalDate creatAt;
	private LocalDate updateAt;
	
	
	
	
	
//	   alt+shift+s getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public LocalDate getCreatAt() {
		return creatAt;
	}
	public void setCreatAt(LocalDate creatAt) {
		this.creatAt = creatAt;
	}
	public LocalDate getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(LocalDate updateAt) {
		this.updateAt = updateAt;
	}
	
	
	
}
