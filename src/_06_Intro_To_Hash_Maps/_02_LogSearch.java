package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	HashMap<Integer, String> hash = new HashMap<Integer, String>();
	JFrame frame;
	JPanel panel;
	JButton button1, button2, button3, button4;

	public static void main(String[] args) {
		_02_LogSearch log = new _02_LogSearch();
	}

	public _02_LogSearch() {
		init();
	}

	public void init() {
		frame = new JFrame();
		panel = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();

		panel.add(button1);
		button1.setText("Add Entry");
		button1.addActionListener(this);
		panel.add(button2);
		button2.setText("Search by ID");
		button2.addActionListener(this);
		panel.add(button3);
		button3.setText("View List");
		button3.addActionListener(this);
		panel.add(button4);
		button4.setText("Remove Entry");
		button4.addActionListener(this);

		frame.add(panel);
		frame.setResizable(false);
		frame.setSize(300, 100);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		int key;
		String keyAsString;
		String everyLog="";
		String value;
		Object source = e.getSource();
		if (source == button1) {
			keyAsString = JOptionPane.showInputDialog("Enter an ID tag");
			key = Integer.parseInt(keyAsString);
			value = JOptionPane.showInputDialog("Enter a name");
			hash.put(key, value);
			JOptionPane.showMessageDialog(null, "Entry added");
		} else if (source == button2) {
			keyAsString = JOptionPane.showInputDialog("Enter an ID tag");
			key = Integer.parseInt(keyAsString);
			if(hash.containsKey(key)) {
				JOptionPane.showMessageDialog(null, "ID: "+key+" Name: "+hash.get(key));
			}else {
				JOptionPane.showMessageDialog(null, "Entry does not exist in log");
			}
		}else if(source == button3) {
			everyLog="";
			for (int i = 0; i < hash.size(); i++) {
				everyLog = everyLog+"ID: "+hash.keySet().toArray()[i]+" Name: "+hash.values().toArray()[i]+"\n";
			}
			JOptionPane.showMessageDialog(null, everyLog);
		}else if(source == button4) {
			keyAsString = JOptionPane.showInputDialog("Enter an ID tag");
			key = Integer.parseInt(keyAsString);
			if(hash.containsKey(key)) {
				hash.remove(key);
				JOptionPane.showMessageDialog(null, "Entry successfully removed");
			}else {
				JOptionPane.showMessageDialog(null, "Entry does not exist in log");
			}
		}
	}

}
