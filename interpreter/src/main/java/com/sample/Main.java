package com.sample;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JFrame;

import com.sample.interpreter.Context;
import com.sample.interpreter.DrawCanvas;
import com.sample.interpreter.Node;
import com.sample.interpreter.ProgramNode;

class Main extends JFrame {

	private static final long serialVersionUID = -521926554254548944L;

	public static void main(String args[]) {
		new Main("interpreter");
	}

	private DrawCanvas canvas = new DrawCanvas();

	public Main(String title) {
		super(title);
		this.addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
		getContentPane().add(canvas);
		pack();
		setVisible(true);

		try {
			String filepath = Main.class.getClassLoader().getResource("program.txt").getPath();
			BufferedReader reader = new BufferedReader(new FileReader(filepath));
			String text;
			while ((text = reader.readLine()) != null) {
				System.out.println("text = \"" + text + "\"");
				Node node = new ProgramNode();
				node.parse(new Context(text));
				System.out.println("node = " + node);
				node.draw(canvas);
			}
			reader.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
