package venkat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Song_main {

	
	
	public static void main(String[] args) throws ParseException {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of songs:");
		int noOfSongs=sc.nextInt();
		Song []songs=new Song[noOfSongs];
		
		for(int i=0;i<noOfSongs;i++)
		{
			String line=sc.nextLine();
			if(line.equals(""))
				line=sc.nextLine();
			//to convert line string into song object
			songs[i]=Song.createSong(line);			
		}
		
		
		System.out.println("Enter a type to sort: \r\n" + 
				"1.Sort by Duration \r\n" + 
				"2.Sort by Rating \r\n" + 
				"");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			//sort by duration
			Arrays.sort(songs); 			//default sorting
			break;
		case 2:
			//sort by rating
			Arrays.sort(songs,new Ratingcomparator());
			break;
		}
		
        SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
		
		System.out.format("%-20s %-10s %-12s %-12s\n","Title","Genre","Duration","Rating");
		
		
		for(Song c:songs) {
			
			System.out.format("%-20s %-10s %-12s %-12s\n",c.getTitle(),c.getGenre(),sdf.format(c.getDuration()),c.getRating());
			
			
		}
	}

}
