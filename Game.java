import java.util.*;

/**
 * @author PBejabe1
 *
 */
public class Game {
	int score;
	int levelCompleted;
	int bonus;
	boolean gameOver;
	public HighScoreEntry ScoreEntry;
	ArrayList<HighScoreEntry> highScores;
	Scanner input;
	
	
	/**
	 * 
	 */
	public int printScore(String name, int score, int levelCompleted, int bonus) {
		int finalScore = score + (levelCompleted * bonus);
		System.out.println("Your final score was:" + finalScore);
		recordHighScore(name, finalScore);
		return finalScore;
	}
	
	/**
	 * 
	 */
	public void recordHighScore(String name, int score) {
		ScoreEntry = new HighScoreEntry(name, score);
		highScores.add(ScoreEntry);
	}
	
	/**
	 * 
	 */
	public void displayAllScores() {
		for(int i = 0; i<highScores.size();i++){
			System.out.println(highScores.get(i));
//			ScoreEntry = highScores.get(i);
//			String temp = ScoreEntry.getName();
//			int tempScore = ScoreEntry.getScore();
//			System.out.println("Player's name: \t" + temp);
//			System.out.println("Score: \t\t" + tempScore);
		}	
	}
	
	/**
	 * 
	 */
	public void getScore(int index) {
		ScoreEntry = highScores.get(index);
		String temp = ScoreEntry.getName();
		int tempScore = ScoreEntry.getScore();
		System.out.println("Player's name: \t" + temp);
		System.out.println("Score: \t\t" + tempScore);	
	}
	
	/**
	 * 
	 */
	public void sortScores() {
		Collections.sort(this.highScores);
	}
	
	public int displayTopThree() {
		if(highScores.size() <= 0) {
			System.out.println("Not Enough Entries!");
			return -1;
		}
		if(highScores.size() < 3) {
			for(int i = 0; (i < highScores.size()); i++) {
				System.out.println(highScores.get(i));
			}
			return 0;
		}else {
			for(int i = 0; (i < 3); i++) {
			System.out.println(highScores.get(i));
			}
			return 0;
		}
	}
	
	/**
	 * 
	 */
	public Game() {
		score= 0;
		levelCompleted = 0;
		bonus = 0;
		gameOver = false;
		highScores = new ArrayList<HighScoreEntry>();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Game a = new Game();
		
//		ArrayList<HighScoreEntry> test = new ArrayList<HighScoreEntry>();
//		test.add(new HighScoreEntry("a",1000));
//		test.add(new HighScoreEntry("b",2000));
//		test.add(new HighScoreEntry("c",3000));
//		test.add(new HighScoreEntry("d",300));
//		Collections.sort(test);
//		
//		for(HighScoreEntry e: test) {
//			System.out.println(e);
//		}
		while(!a.gameOver)
			a.topMenu();
		
		System.out.println("Thank you for Playing!");	
	}
	
	public void topMenu() {
		input = new Scanner(System.in);
		System.out.println("Please select a Menu Choice."
				+ "\n0: Play the Game"
				+ "\n1: Display all Scores"
				+ "\n2: Display Top 3 Scores"
				+ "\n3: End Game");
		
		int result = input.nextInt();
		switch (result) {
			case 0 : run(); break;
			
			case 1 : displayAllScores(); break;
			
			case 2 : displayTopThree(); break;
			
			case 3 : gameOver = true; break;
			
			default : break;
		}
	}
	
	public void run() {
		input = new Scanner(System.in);
		String name;
		int score;
		int level;
		int bonus;
		
		for(;;){
			
			System.out.print("Please Enter your name: ");
			name = input.nextLine();

			System.out.print("Please Enter your score: ");
			score = input.nextInt();
			
			System.out.print("Please Enter the level you made it to: ");
			level = input.nextInt();
			
			System.out.print("Please Enter the bonus: ");
			bonus = input.nextInt();
			
			input.nextLine(); // Extra read line to consume the \n character remaining 
			
			printScore(name, score, level, bonus);
			
			//Sorts top scores
			sortScores();
			
			System.out.print("Would you like to play again? (Y/N) ");
			String status = input.nextLine();
			char c = status.charAt(0);
			if(c=='N')
				break;
		}
		return;
	}
}
