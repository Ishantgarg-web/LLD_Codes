import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookMyShow {
	private List<User> users;
	private List<Theater> theaters;
	
	private HashMap<String, ArrayList<Show>> movieMap;
	public BookMyShow(List<Theater> theaters) {
		this.users = new ArrayList<>();
		this.theaters = theaters;
		this.movieMap = new HashMap<>();
		
		generateMovieMap();
	}
	
	public void generateMovieMap() {
		/**
		 * This method will populate this movieMap, for each movieName, with its shows.
		 * for each Theater, we have List<shows> for each show, we have a movie.
		 */
		for (Theater theater: this.theaters) {
			for (Show show: theater.getShows()) {
				Movie movie = show.getMovie();
				ArrayList<Show> al = new ArrayList<>();
				if(this.movieMap.containsKey(movie.getName())) {
					al = this.movieMap.get(movie.getName());
				}
				al.add(show);
				this.movieMap.put(movie.getName(), al);
			}
		}
		
	}
	
	public List<Show> searchShows(String movieName){
		if(this.movieMap.containsKey(movieName)) {
			System.out.println("Shows are: ");
			return this.movieMap.get(movieName);
		}else {
			System.out.println("No shows present for this movie");;
			return null;
		}
	}
	
	public List<Theater> getTheaters() {
		return theaters;
	}
	
	public List<User> getUsers() {
		return users;
	}
	
	public void setTheaters(List<Theater> theaters) {
		this.theaters = theaters;
	}
	
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public Ticket bookTicket(Show show, int seats, RegisteredUser user, String theater) {
		if(user instanceof RegisteredUser && seats>0) {
			return show.bookTicket(seats, user, theater);
		}else {
			System.out.println("User is not registered yet or entered wrong details");
			return null;
		}
	}
	
	public static void main(String[] args) {
		// Initialize all model objects
		RegisteredUser ishant = new RegisteredUser("ishant");
//		ishant.registerUser("ishant", "ishant@gmail.com", "ishant123");
		
		Movie gadar = new Movie("gadar", LANGUAGE.HINDI, GENRE.ACTION);
		Movie omg = new Movie("omg", LANGUAGE.HINDI, GENRE.COMEDY);
		Movie pie = new Movie("pie", LANGUAGE.ENGLISH, GENRE.ACTION);
		
		Theater hisar = new Theater("hisar", "Dabra", 100);
		Theater delhi = new Theater("delhi", "new delhi", 50);
		
		Show pieShowHisar = new Show(LocalDateTime.of(2024, 04, 21, 10, 0), pie, hisar);
		Show gadarShowHisar = new Show(LocalDateTime.of(2024, 04, 21, 11, 0), gadar, hisar);
		Show pieShowdelhi = new Show(LocalDateTime.of(2024, 04, 22, 10, 0), pie, delhi);
		
		// Create object of BookMyShow Application
		ArrayList<Theater> allTheaters = new ArrayList<>();
		allTheaters.add(delhi);
		allTheaters.add(hisar);
		
		BookMyShow bookMyShow = new BookMyShow(allTheaters);
	
		// search shows
		List<Show> allGadarShows = bookMyShow.searchShows("pie");
		if(allGadarShows!=null) {
			for (Show show: allGadarShows) {
				System.out.println(show);
			}
		}
		
		// use it to book tickets 
		bookMyShow.bookTicket(pieShowdelhi, 3, ishant, "delhi");
		
		// search shows
				allGadarShows = bookMyShow.searchShows("pie");
				if(allGadarShows!=null) {
					for (Show show: allGadarShows) {
						System.out.println(show);
					}
				}
	}
}
