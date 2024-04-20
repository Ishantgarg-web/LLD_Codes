import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Theater {
	private int id;
	private static int idCounter = 0;
	private String name;
	private String location;
	private int capacity;
	private List<Show> shows;
	
	public Theater(String name, String location, int capacity) {
		super();
		idCounter+=1;
		this.id = idCounter;
		this.name = name;
		this.location = location;
		this.capacity = capacity;
		this.shows = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public List<Show> getShows() {
		return shows;
	}

	public void setShows(List<Show> shows) {
		this.shows = shows;
	}
	
	public void updateShow(Show oldShow, Show newShow) {
		this.shows.remove(oldShow);
		this.shows.add(newShow);
		System.out.println("Show is updated successfully");
	}
	
	public void getshows(LocalDateTime time) {
		int idx = 1;
		for (Show show: this.shows) {
			if(show.getShowTime() == time) {
				System.out.println("Show "+idx+" is: "+show.getMovie()+" and time is: "+show.getShowTime()+""
						+ "and theater is: "+show.getTheater().getName());
				idx += 1;
			}
		}
	}

//	@Override
//	public String toString() {
//		return "Theater [id=" + id + ", name=" + name + ", location=" + location + ", capacity=" + capacity + ", shows="
//				+ shows + "]";
//	}
	
	
	
}
