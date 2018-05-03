/**
 * 
 */

/**
 * @author PBejabe1
 *
 */
public class HighScoreEntry {
	String playerName;
	int playerScore;
	
	
	/**
	 * Constructor Method
	 */
	public HighScoreEntry(String name, int score) {
		playerName = name;
		playerScore = score;
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
