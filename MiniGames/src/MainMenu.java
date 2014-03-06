import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Component;



public class MainMenu extends JPanel {
	
	private boolean soundToggle;
	private ImageIcon soundOnIcon, soundOffIcon;
	private GameMenu gameMenu;
	
	public MainMenu() {
		
		setSize(new Dimension(MENU_WIDTH, MENU_HEIGHT));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setBounds(159, 113, 182, 51);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(194, 270, 109, 62);
		add(btnNewButton);
		
		
		
		gameMenu = new GameMenu();
		
	}
	
	private class PlayListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			
		}
		
	}
	
	public static final int MENU_WIDTH = 500;
	public static final int MENU_HEIGHT = 500;
}
