import java.awt.Dimension;

import javax.swing.JFrame;

public class Main extends JFrame {
	
	public Main() {
		setSize(new Dimension(MainMenu.MENU_WIDTH, MainMenu.MENU_HEIGHT));
		add(new MainMenu());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main (String[] args) {
		new Main();
	}
		
}

