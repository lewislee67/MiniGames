import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.Timer;


public class ArithmeticGamePlayer extends JPanel implements GamePlayer {
	
	private ArithmeticGame game;
	private JTextPane question;
	private Timer timer;
	private int answerPos;
	String currentAnswer;
	int questionsAnswered;
	int time;

	public ArithmeticGamePlayer() {
		setSize(new Dimension(500, 500));
		setFocusable(true);
		game = new ArithmeticGame();
		question = new JTextPane();
		question.setFont(new Font("Serif", Font.PLAIN, 100));
		question.setEditable(false);
		question.setFocusable(false);
		add(question);
		addKeyListener(new gameListener());
		timer = new Timer(10, new timerListener());
		run();
	}
	
	public void run() {
		time = 0;
		questionsAnswered = 0;
		newQuestion();
		timer.start();
		
	}
	
	private void newQuestion() {
		game.initialise();
		question.setText(game.getDisplay());
		answerPos = 0;
		currentAnswer = null;
	}
	
	private void correct() {
		//if (questionsAnswered < 9) {
			newQuestion();
			questionsAnswered++;
		//} else {
		//	finish(true);
		//}
	}
	
	private void incorrect() {
		//System.out.println("??");
		//finish(false);
	}
	
	private void finish(boolean won) {
		timer.stop();
	}
	
	private class timerListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			time++;
		}
	}
	
	private class gameListener implements KeyListener {

		public void keyPressed(KeyEvent e) {
			if ((e.getKeyChar() <= '9' && e.getKeyChar() >= '0') || e.getKeyChar() == '-') {
				if (checkAnswer(e.getKeyChar())) {
					answerPos++;
					if (answerPos == game.getAnswer().length()) {
						correct();
					} else {
						if (answerPos == 1) {
							Character c = e.getKeyChar();
							currentAnswer = c.toString();
						} else {
							currentAnswer = currentAnswer + e.getKeyChar();
						}
						game.fillUnknown(currentAnswer);
						question.setText(game.getDisplay());
					}
				} else {
					incorrect();
				}
			}
		}
		
		private boolean checkAnswer(char c) {
			if (game.getAnswer().charAt(answerPos) == c) {
				return true;
			}
			return false;
		}

		public void keyReleased(KeyEvent arg0) {
		}
		public void keyTyped(KeyEvent arg0) {
		}
	}

}
