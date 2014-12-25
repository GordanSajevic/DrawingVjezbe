

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Circle extends JPanel implements ActionListener{
	
	private int x;
	private int y;
	private int radius;
	private boolean isFilled; 
	private Color color;
	private int speedX;
	private int speedY;
	private Dimension windowDimension;

	public Circle(int x, int y, int radius, boolean isFilled, Color color, int speedX, int speedY, Dimension windowDimension)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.isFilled = isFilled;
		this.color = color;
		this.speedX = speedX;
		this.speedY = speedY;
		this.windowDimension = windowDimension;
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getSpeedX() {
		return speedX;
	}

	public void setSpeedX(int speedX) {
		if (speedX < 0)
		{
			throw new IllegalArgumentException("Speed cannot be lesser than zero!");
		}
		else
		{
			this.speedX = speedX;
		}
	}

	public int getSpeedY() {
		return speedY;
	}

	public void setSpeedY(int speedY) {
		if (speedY < 0)
		{
			throw new IllegalArgumentException("Speed cannot be lesser than zero!");
		}
		else
		{
			this.speedY = speedY;
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x < 0)
		{
			throw new IllegalArgumentException("X cannot be lesser than zero!");
		}
		else
		{
			this.x = x;
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if (y < 0)
		{
			throw new IllegalArgumentException("Y cannot be lesser than zero!");
		}
		else
		{
			this.y = y;
		}
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		if (radius < 0)
		{
			throw new IllegalArgumentException("Radius cannot be lesser than zero!");
		}
		else
		{
			this.radius = radius;
		}
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(color);
		if (isFilled)
		{
			g.fillOval(x, y, radius, radius);
		}
		else
		{
			g.drawOval(x, y, radius, radius);
		}
		move();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
	public void move()
	{
		if (this.x < 0 || this.x > windowDimension.getWidth())
		{
			this.speedX *= -1;
		}
		if (this.y < 0 || this.y > windowDimension.getHeight())
		{
			this.speedY *= -1;
		}
		this.x += speedX;
		this.y += speedY;
	}
	

}
