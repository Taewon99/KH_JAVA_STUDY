package chapter05;

public class Movie {

	private String title, director, company;

	public Movie(String title, String director) {
		super();
		this.title = title;
		this.director = director;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + "]";
	}

}
