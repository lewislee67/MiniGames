import java.util.LinkedList;


public class Data {

	private LinkedList<Integer> scores;
	
	public Data() {
		scores = new LinkedList<Integer>(); 
	}
	
	public void addScore(int gameNo, int score) {
		scores.add(gameNo, score);
	}
}
