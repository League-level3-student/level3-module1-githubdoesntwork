package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame;
	JPanel panel;
	JButton addName;
	JButton viewNames;
	String print="";
	int i = 0;

	public static void main(String[] args) {
		_02_GuestBook book = new _02_GuestBook();
		book.config();
	}

	public void config() {
		frame = new JFrame();
		panel = new JPanel();
		addName = new JButton("Add Name");
		viewNames = new JButton("View Names");

		panel.add(addName);
		panel.add(viewNames);

		frame.add(panel);

		frame.setVisible(true);
		frame.setResizable(false);
		frame.pack();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		addName.addActionListener(this);
		viewNames.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==addName) {
			String name = JOptionPane.showInputDialog("Add a name:");
			i++;
			print=print+"Guest #"+i+": "+name+"\n";
		}else {
			JOptionPane.showMessageDialog(null, print);
		}
	}
}