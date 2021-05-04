package cst438;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class MovieRatings {
	
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	@Size(min = 3, max = 25)
	private String name;
	
	@NotNull
	@Size(min = 3, max = 25)
	private String movieName;
	
	@NotNull
	private int rating;
	

	private String time;
	
	public MovieRatings() {
		
	}

	public MovieRatings(long id, String name, String movieName, int rating, String time) {
		super();
		this.id = id;
		this.time = time;
		this.name = name;
		this.movieName = movieName;
		this.rating = rating;
	}
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
