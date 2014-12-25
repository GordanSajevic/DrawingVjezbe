

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

//Predavanje

public class OurSliderTest extends JPanel{
	
	JLabel myLabel;
	JSlider mySlider;
	
	public OurSliderTest()
	{	
		super();
		this.setLayout(new GridLayout(2, 1));
		myLabel = new JLabel("Nemoj ništa dirati, molim te :)");
		this.add(myLabel);
		mySlider = new JSlider(JSlider.VERTICAL, 5, 10, 7);
		this.add(mySlider);
		
		mySlider.addChangeListener(new myChangeListener());
	}
	
	private class myChangeListener implements ChangeListener
	{

		@Override
		public void stateChanged(ChangeEvent e) {
			if (e.getSource() == mySlider)
			{
				myLabel.setText("Dirao si slajder i vrijednost je: " + mySlider.getValue());
			}
			
		}
		
	}

	public static void main(String[] args){
		
		JFrame jF = new JFrame("Da i mi nešto otkucamo :)");
		jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jF.setSize(new Dimension(640, 480));
		jF.setLocation(100, 100);
		jF.setContentPane(new OurSliderTest());
		jF.setVisible(true);
	}

}
