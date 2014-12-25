

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MovingCircle extends JPanel implements ActionListener{

	public int frame = 0;
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		window.setSize(1000, 1000);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MovingCircle circle = new MovingCircle();
		window.setContentPane(circle);
		circle.repaint();
		window.setVisible(true);
		Timer t = new Timer(50, circle);
		t.start();
	}

	public void paintComponent(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillOval(10 + frame, 10 + frame, 100, 100);
		g.setColor(Color.BLUE);
		g.fillRect(1000-frame, 10 + frame, 100, 100);
		g.setColor(Color.GREEN);
		g.fillRect(10 + frame, 1000 - frame, 80, 150);
		g.setColor(Color.YELLOW);
		g.fillOval(1000 - frame, 1000 - frame, 150, 80);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		frame += 5;
		repaint();
		setBackground(Color.CYAN.brighter());
		
	}

}
