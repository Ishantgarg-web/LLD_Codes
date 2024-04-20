import java.time.LocalDateTime;

public class Show {
	private static int idCounter = 0;
	private int id;
	private LocalDateTime showTime;
	private int availableSeats;
	private Movie movie; 
	private Theater theater;
	
	public Show(LocalDateTime showTime, Movie movie, Theater theater) {
		super();
		idCounter+=1;
		this.id = idCounter;
		this.showTime = showTime;
		this.movie = movie;
		this.theater = theater;
		this.availableSeats = theater.getCapacity();
		theater.getShows().add(this);
	}
	
	public int getId() {
		return id;
	}
	
	public LocalDateTime getShowTime() {
		return showTime;
	}

	public void setShowTime(LocalDateTime showTime) {
		this.showTime = showTime;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Theater getTheater() {
		return theater;
	}

	public void setTheater(Theater theater) {
		this.theater = theater;
	}
	
	
	
	@Override
	public String toString() {
		return "Show [id=" + id + ", showTime=" + showTime + ", availableSeats=" + availableSeats + ", movie=" + movie.getName()
				+ ", theater=" + theater.getName() + "]";
	}

	/**
	 * 
	 * @param seats
	 * @param user
	 * It means for given user(it is registered user), book this show with provided seats.
	 * 
	 * Conditions:
	 * 1. seats must be available: show.seats>seats
	 * 2. user must be registered, but here we are taking registerUser object, so no need to check this
	 * condition.
	 * 3. 
	 * @return
	 */
	public Ticket bookTicket(int seats, RegisteredUser user,String theater) {
		
		if(this.getAvailableSeats()>=seats) {
			LocalDateTime currTime = LocalDateTime.now();
			this.setAvailableSeats(this.getAvailableSeats() - seats);
			Ticket ticket =  new Ticket(user.getName(), currTime, seats, theater);
			System.out.println("Ticket booked Successfully");
			return ticket;
		}else {
			System.out.println("Seats not available, available seats are: "+this.getAvailableSeats());
			return null;
		}
		
	}
}
