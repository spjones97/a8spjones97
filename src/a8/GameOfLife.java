package a8;

import java.awt.*;

import javax.swing.*;

public class GameOfLife {

	public static void main(String[] args) {
		View view = new View();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Conway's Game of Life");
		frame.add(view, BorderLayout.CENTER);
		view.start();
		frame.setSize(view.getWidth(), view.getHeight() + 20);
		frame.setVisible(true);
	}
}