package venkat;

import java.util.Comparator;

public class Ratingcomparator implements Comparator<Song> {

	@Override
	public int compare(Song o1, Song o2) {
		// TODO Auto-generated method stub
		return o1.getRating().compareTo(o2.getRating());
	}

	
}
