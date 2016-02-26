package SID13025.Lab2.Person_Age;

public class Book {
	private int pages;

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	public Book(int p) {
		this.pages=p;
		// TODO Auto-generated constructor stub
	}
	boolean isThin()
	{
		if(pages<10)
			return true;
		return false;
	}
	void burn()
	{
		pages=0;
	}
	void trace(String Book_name)
	{
		System.out.println(Book_name +" has "+pages);
	}
}
