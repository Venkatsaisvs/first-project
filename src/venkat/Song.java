package venkat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Song implements Comparable<Song> {

	
	
	private String title;
	private String genre;
	private Date duration;
	private Double rating;
	
	
	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Song(String title, String genre, Date duration, Double rating) {
		super();
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.rating = rating;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public Date getDuration() {
		return duration;
	}


	public void setDuration(Date duration) {
		this.duration = duration;
	}


	public Double getRating() {
		return rating;
	}


	public void setRating(Double rating) {
		this.rating = rating;
	}

	public static Song createSong(String line) throws ParseException
	{
		String[] arr = line.split(",");
		String title=arr[0];
		String genre=arr[1];
		SimpleDateFormat sdf=new SimpleDateFormat("mm:ss");
		Date duration=sdf.parse(arr[2]);
		Double rating=Double.valueOf(arr[3]);
		Song song=new Song(title, genre, duration, rating);
		return song;
	}
 
	@Override
	public int compareTo(Song o) {
		
		return this.getDuration().compareTo(o.getDuration());
	}

}
