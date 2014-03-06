import java.awt.Dimension;
import javax.swing.JPanel;

public abstract class BasicGame extends JPanel implements Minigame {

	public void initialise() {
		this.setSize(new Dimension(MainMenu.MENU_WIDTH, MainMenu.MENU_HEIGHT));
		
	}
}
