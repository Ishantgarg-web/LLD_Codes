import java.time.LocalDateTime;

public class Ticket {
	private static int idCounter = 0;
	private int id;
	private String ownerName;
	private LocalDateTime bookingTime;
	private int numberOfSeats;
	private String theater;
	
	public Ticket(String ownerName, LocalDateTime bookingTime, int numberOfSeats, String theater) {
		super();
		idCounter+=1;
		this.id = idCounter;
		this.ownerName = ownerName;
		this.bookingTime = bookingTime;
		this.numberOfSeats = numberOfSeats;
		this.theater = theater;
	}
	/**
	 * Getters and setters.
	 * @return
	 */
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public LocalDateTime getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(LocalDateTime bookingTime) {
		this.bookingTime = bookingTime;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getTheater() {
		return theater;
	}
	
	public void setTheater(String theater) {
		this.theater = theater;
	}
	
	
	
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", ownerName=" + ownerName + ", bookingTime=" + bookingTime + ", numberOfSeats="
				+ numberOfSeats + ", theater=" + theater + "]";
	}
	public int cancelTicket() {
		// We are setting up zero for all the values.
		this.theater = null;
		this.ownerName = null;
		this.numberOfSeats = 0;
		
		System.out.println("Ticket got cancelled successfully");
		
		return 1;
	}
}
