package Internship;

public abstract class MediaItem extends item{
	
	private int runtime;

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	

}

 class Video extends MediaItem
{
	private String director,genre;
	private int releasedyear;
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getReleasedyear() {
		return releasedyear;
	}
	public void setReleasedyear(int releasedyear) {
		this.releasedyear = releasedyear;
	}
	
	public void checkin() {
		System.out.println("Checked in Media Item");
	}
	public void checkout() {
		System.out.println("Checked out from Media Item");
	}
	public void add() {
		System.out.println("video added");
	}
	public  void print() {
		System.out.println("This is video section Written Item");
	}
	
}

 class CD extends MediaItem
{
	private String artist,genre;

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void checkin() {
		System.out.println("Checked in Media Item");
	}
	public void checkout() {
		System.out.println("Checked out from Media Item");
	}
	public void add() {
		System.out.println("CD added");
	}
	public  void print() {
		System.out.println("This is CD section Media Item");
	}
	
}