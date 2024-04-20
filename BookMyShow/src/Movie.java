
public class Movie {
	private String name;
	
	private float ratings;
	
	private LANGUAGE language;
	
	private GENRE genre;

	public Movie(String name, LANGUAGE language, GENRE genre) {
		super();
		this.name = name;
		this.language = language;
		this.genre = genre;
		this.ratings = 0.0f;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public LANGUAGE getLanguage() {
		return language;
	}

	public void setLanguage(LANGUAGE language) {
		this.language = language;
	}

	public GENRE getGenre() {
		return genre;
	}

	public void setGenre(GENRE genre) {
		this.genre = genre;
	}

//	@Override
//	public String toString() {
//		return "Movie [name=" + name + ", ratings=" + ratings + ", language=" + language + ", genre=" + genre + "]";
//	}
	
	
	
}
