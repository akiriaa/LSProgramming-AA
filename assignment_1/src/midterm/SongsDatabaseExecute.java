package midterm;

import java.util.Iterator;
import java.util.Set;
/**
 * SongsDatabaseExecute class
 * @author tilic
 *
 */
public class SongsDatabaseExecute {
	/**
	 * Tests the implementation from the SongDatabase class
	 * @param args
	 */
	public static void main(String[] args) {
		SongsDatabase newSong = new SongsDatabase();
		
		newSong.addSong("Soul", "SoulSong1");
		newSong.addSong("Soul", "SoulSong2");
		newSong.addSong("Soul", "SoulSong3");
		newSong.addSong("Rock", "RockSong1");
		newSong.addSong("Rock", "RockSong2");
		newSong.addSong("Rock", "RockSong3");
		newSong.addSong("Jazz", "JazzSong1");
		newSong.addSong("Jazz", "JazzSong2");
		newSong.addSong("Jazz", "JazzSong3");
		
		System.out.print("Genre of RockSong1: " + newSong.getGenreOfSong("RockSong1"));
		
		Set<String> set = newSong.getSongs("Jazz");
        Iterator value = set.iterator();
        System.out.println("\nSongs in Jazz genre:");
        while(value.hasNext()){
            System.out.println(value.next());
        }
        
	}	    
}
