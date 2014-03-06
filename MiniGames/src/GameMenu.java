
public class GameMenu {

	private Data data;
	private GameOne gameOne;
	
	public GameMenu() {
		
	}
	
	public void playGame(Minigame game) {
		game.initialise();
	}
}
