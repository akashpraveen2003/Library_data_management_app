package library_app;

class Library_Item
{
	private int id;
	private String title;
	private int year;
	public  int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public  String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
class Book extends Library_Item
{
	private String author;
	private String issued_date;
	private String return_date;
	public String getAuthor() {
		return author;
	}
	Book()
	{
		
	}
	Book(int id,String title,int year,String author,String issued_date,String return_date)
	{
		super.setId(id);
		super.setTitle(title);
		super.setYear(year);
		this.author=author;
		this.issued_date=issued_date;
		this.return_date=return_date;
	}
	public String getIssued_date() {
		return issued_date;
	}

	public void setIssued_date(String issued_date) {
		this.issued_date = issued_date;
	}

	public String getReturn_date() {
		return return_date;
	}

	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public  void getDetails(Book obj)
	{
		System.out.println("Bookid : "+obj.getId());
		System.out.println("AuthorName : "+obj.getAuthor());
		System.out.println("Book Title : "+obj.getTitle());
		System.out.println("Year published : "+obj.getYear());
		System.out.println("Issued date : "+obj.getIssued_date());
		System.out.println("Return date: "+obj.getReturn_date());
		System.out.println("------------------------------");
	}
}
class Magazine extends Library_Item
{
	private int issue;
	private String author;
	public int getIssue() {
		return issue;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setIssue(int issue) {
		this.issue = issue;
	}
	public  void getdetails(Magazine obj)
	{
		System.out.println("Magazineid : "+obj.getId());
		System.out.println("AuthorName : "+obj.getAuthor());
		System.out.println("Magazine Title : "+obj.getTitle());
		System.out.println("Year published : "+obj.getYear());
		System.out.println("Issue : "+obj.getIssue());
		System.out.println("------------------------------");
	}
}


public class Library_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1=new Book();
		book1.setId(100);
		book1.setTitle("Harry Potter 1");
		book1.setYear(2003);
		book1.setAuthor("JK Rowling");
		book1.setIssued_date("1-1-23");
		book1.setReturn_date("31-1-23");
		book1.getDetails(book1);
		
		Book book2=new Book(101,"Harry Potter 2",2007,"JK Rowling","1-2-23","28-2-23");
		book2.getDetails(book2);
		
		Magazine magazine=new Magazine();
		magazine.setId(1001);
		magazine.setTitle("Times India");
		magazine.setYear(2023);
		magazine.setIssue(12);
		magazine.setAuthor("patel");
		magazine.getdetails(magazine);
		
	}

}
