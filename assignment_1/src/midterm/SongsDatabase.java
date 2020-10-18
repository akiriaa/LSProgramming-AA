package midterm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/**
 * 
 * @author tilic
 *
 */
public class SongsDatabase {
	private Map<String, Set<String>> genreMap = new HashMap<String, Set<String>>();
	/**
	 * Adds songs to the hashmap		
	 * @param genre
	 * @param songTitle
	 */
	public void addSong(String genre, String songTitle) {
	// You must implement this method
		if(genreMap.containsKey(genre)) {
			genreMap.get(genre).add(songTitle);
		}
		else {
			Set<String> song = new HashSet<String>();
			song.add(songTitle);
			genreMap.put(genre, song);
		}
	}
	/**
	 * 
	 * @param genre
	 * @return the song from the hashmap
	 */
	public Set<String> getSongs(String genre) {
	// You must implement this method
		return genreMap.get(genre);
	}
	/**
	 * 
	 * @param songTitle
	 * @return the genre of the song
	 */
	public String getGenreOfSong(String songTitle) {
	// You must implement this method
		 for (Map.Entry<String, Set<String>> entry : genreMap.entrySet()) {
             if(entry.getValue().contains(songTitle)){
                 return entry.getKey();
             }
         }
         return "N/A";
	}

}
