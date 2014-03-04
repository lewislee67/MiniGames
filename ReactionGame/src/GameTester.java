import java.awt.Dimension;
import javax.swing.JFrame;


public class GameTester extends JFrame {
	
	public GameTester() {
		setSize(new Dimension(500, 500));
		add(new ArithmeticGamePlayer());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GameTester();
		
	}
}
