package Internship;

public abstract class item {
	
	public item() {
		
	}
	
	
	public void setid(int id) {
		this.id=id;
	}
	
	public void setnoc(int noc) {
		this.noc=noc;
	}
	
	public void settitle(String title) {
		this.title=title;
	}
	
	public int getid() {
		return id;
	}
	
	public int getnoc() {
		return noc;
	}
	
	public String gettitle() {
		return title;
	}
	
	private int id,noc;
	private String title;
	
	public abstract void checkin();
	public abstract void checkout();
	public abstract void add();
	public abstract void print();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
