package _04_HangMan;

import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan {

	JFrame frame;
	JPanel panel;
	JLabel letters;
	JLabel hangman;
	int failedTries = 0;
	char playerGuess;
	Stack<Character> guessed = new Stack<Character>();
	String word;
	String display = "";
	boolean win = false;

	public static void main(String[] args) {
		HangMan game = new HangMan();
	}

	public HangMan() {
		initFrame();
		run();
	}

	public void initFrame() {
		frame = new JFrame();
		panel = new JPanel();
		letters = new JLabel();
		hangman = new JLabel();

		frame.add(panel);
		panel.add(letters);
		panel.add(hangman);

		frame.setResizable(false);
		frame.setSize(200, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

	public void run() {
		word = JOptionPane.showInputDialog("Input a word");
		for (int i = 0; i < word.length(); i++) {
			display = display + "_";
		}
		letters.setText(display);
		while (!win || failedTries > 5) {
			nextTurn();
		}
	}

	public void nextTurn() {
		while (true) {
			String pg = JOptionPane.showInputDialog("Enter one character");
			if (pg.equals("")) {
				JOptionPane.showMessageDialog(null, "You didn't enter anything!");
			} else {
				playerGuess = pg.charAt(0);
				if (guessed.contains(playerGuess)) {
					JOptionPane.showMessageDialog(null, "You have already guessed this!");
				} else {
					guessed.add(playerGuess);
					System.out.println(guessed);
					break;
				}
			}
		}
		display = "";
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < guessed.size(); j++) {
			if (word.charAt(i) == guessed.get(j)) {
				display = display + guessed.get(j);
				System.out.println("ree");
			} else {
				display = display + "_";
			}
		}
		}
		letters.setText(display);
		System.out.println(display);

	}
}
