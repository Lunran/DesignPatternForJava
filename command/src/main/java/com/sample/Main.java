package com.sample;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.sample.command.Command;
import com.sample.command.MacroCommand;
import com.sample.drawer.DrawCanvas;
import com.sample.drawer.DrawCommand;

class Main extends JFrame {

	private static final long serialVersionUID = 8662287463258822642L;

	private MacroCommand history = new MacroCommand();
	private DrawCanvas canvas = new DrawCanvas(400, 400, history);
	private JButton clearButton = new JButton("clear");
	private JButton changeButton = new JButton("change color");
	private JButton undoButton = new JButton("undo");
	private Color color = Color.red;

	public Main(String title) {
		super(title);

		addListeners();

		Box buttonBox = new Box(BoxLayout.X_AXIS);
		buttonBox.add(clearButton);
		buttonBox.add(changeButton);
		buttonBox.add(undoButton);
		Box mainBox = new Box(BoxLayout.Y_AXIS);
		mainBox.add(buttonBox);
		mainBox.add(canvas);
		getContentPane().add(mainBox);

		pack();
		setVisible(true);
	}

	private void addListeners() {
		this.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
		canvas.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseDragged(MouseEvent e) {
					Command cmd = new DrawCommand(canvas, e.getPoint(), color);
					history.append(cmd);
					cmd.execute();
				}
			});
		clearButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == clearButton) {
						history.clear();
						canvas.repaint();
					}
				}
			});
		changeButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == changeButton) {
						if (color == Color.red) {
							color = Color.blue;
						}
						else {
							color = Color.red;
						}
					}
				}
			});
		undoButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == undoButton) {
						for (int i=0; i<10; i++) {
							history.undo();
						}
						canvas.repaint();
					}
				}
			});
	}

	public static void main(String args[]) {
		new Main("Command Pattern Sample");
	}

}
