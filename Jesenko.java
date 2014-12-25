

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Jesenko extends JPanel implements ActionListener{

	int frame = 0;
	Circle circle = new Circle(700 - frame, 10 + frame, 100, false, Color.BLUE, 5, 9, new Dimension(900, 850));
	Circle filledCircle = new Circle(10 + frame, 10 + frame, 100, true, Color.RED, 7, 4, new Dimension(900, 850));
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		circle.draw(g);
		filledCircle.draw(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame++;
		repaint();
		
	}

}
