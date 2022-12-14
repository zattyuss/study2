package ex02;

public class Book {
	private int id;
	private String title;
	private String company;
	
	
	public Book(int id, String title, String company) {
		this.id = id;
		this.title = title;
		this.company = company;
	}
	
	

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


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book book = (Book) obj;
			boolean testId = id == book.getId();
			boolean testTitle = title.equals(book.getTitle());
			boolean testCompany = company.equals(book.getCompany());
			return testId && testTitle && testCompany;
		}
		
		
		return false;
	}
	
	
}
