

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

class TimerHandler implements ActionListener
{
	int counter = 0;
	@Override
	public void actionPerformed(ActionEvent e) {
		counter++;
		System.out.println(counter);
		
	}
	
}


class OtherTimerHandler implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Vozdrica");
		
	}
	
}

public class TimerTest {

	
	public static void main(String[] args) {
		Timer t = new Timer(200, new TimerHandler());
		t.start();
		Timer t2 = new Timer(600, new OtherTimerHandler());
		t2.start();
	}
	
}


