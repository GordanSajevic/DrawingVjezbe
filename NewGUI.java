

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class NewGUI extends JPanel implements ActionListener{

	int frame = 0;
	
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setSize(1000, 1000);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Jesenko draw = new Jesenko();
		window.setContentPane(draw);
		draw.repaint();
		window.setVisible(true);
		Timer t = new Timer(50, draw);
		t.start();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillOval(50+frame, 50+frame, 50, 50);
		method(g);
	}
	
	public void method (Graphics g)
	{
		g.setColor(Color.BLUE);
		g.fillRect(100+frame, 100+frame, 50, 50);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		frame++;
		repaint();
		
		
	}

}
