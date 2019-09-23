package _06_Intro_To_Hash_Maps;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class threeD extends JPanel implements ActionListener {
	public static int WIDTH = 400;
	public static int HEIGHT = 400;
	int counter = 0;
	int x1, y1, x2, y2, FOV = 150, xpo = 0, ypo = 0, zpo = 80, fx1 = 38, fy1 = 38;

	private JFrame window;
	private Timer timer;

	public static void main(String[] args) {
		new threeD().start();
	}

	public void start() {
		window = new JFrame();
		window.setLayout(new BorderLayout());
		window.add(this, BorderLayout.CENTER);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setResizable(false);

		timer = new Timer(1000 / 60, this);
		timer.start();
	}

	public void Calculate3D(int x, int y, int z) {
		x1 = fx1;
		y1 = fy1;
		x2 = Math.round(FOV * ((x + xpo) / (z + zpo)));
		y2 = Math.round(FOV * ((y + ypo) / (z + zpo)));
		fx1 = x2;
		fy1 = y2;
		System.out.println(x1+", "+y1+", "+x2+", "+y2);
	}

	@Override
	public void paintComponent(Graphics g) {
		if(counter==0) {
			g.setColor(Color.black);
			g.fillRect(0, 0, WIDTH, HEIGHT);
		}
		g.setColor(Color.WHITE);
			g.drawLine(x1, y1, x2, y2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Calculate3D(20, 20, 0);
		repaint();
		counter++;
		Calculate3D(20, -20, 0);
		repaint();
	}
}
