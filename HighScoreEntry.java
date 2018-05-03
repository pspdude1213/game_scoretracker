import java.util.*;
/**
 * 
 */

/**
 * @author PBejabe1
 *
 */
public class HighScoreEntry implements Comparable<HighScoreEntry> {
	private String playerName;
	private int playerScore;
	
	
	/**
	 * Constructor Method
	 */
	public HighScoreEntry(String name, int score) {
		this.playerName = name;
		this.playerScore = score;
	}
	
	/**
	 * @Override
	 */
    public int compareTo(HighScoreEntry entry) {
        int compareScore=((HighScoreEntry)entry).getScore();
        /* For Ascending order*/
        return compareScore - this.playerScore;

        /* For Ascending order do like this */
        //return compareScore-this.playerScore;
    }

	/**
	 * @Override
	 */
    public String toString() {
        return "[Player name = " + playerName + ", Score = " + playerScore + "]";
    }

	
	/**
	 * Get Method for the Score
	 * @return String of the player's name
	 */ String getName(){
		return playerName;
	}
	
	/**
	 * Get Method for the Score
	 * @return integer of the High Score
	 */
	public int getScore(){
		return playerScore;
	}
}
