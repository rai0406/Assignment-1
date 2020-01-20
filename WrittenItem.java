package Internship;

public abstract class WrittenItem extends item
{	
private String author;

public void getAuthor() {
	System.out.println(author);
}

public void setAuthor(String author) {
	this.author = author;
}

 	
}

class book extends WrittenItem
{
	public void checkin() {
		System.out.println("Checked in Written Item");
	}
	public void checkout() {
		System.out.println("Checked out from Written Item");
	}
	public void add() {
		System.out.println("book added");
	}
	public  void print() {
		System.out.println("This is book section Written Item");
	}
}

class Journalpaper extends WrittenItem
{
	private int pubyear;

	public int getPubyear() {
		return pubyear;
	}

	public void setPubyear(int pubyear) {
		this.pubyear = pubyear;
	}
	
	public void checkin() {
		System.out.println("Checked in Written Item");
	}
	public void checkout() {
		System.out.println("Checked out from Written Item");
	}
	public void add() {
		System.out.println("journal paper added");
	}
	public  void print() {
		System.out.println("This is journal paper section Written Item");
	}
	
	 
}