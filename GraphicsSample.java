import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class GraphicsSample extends GraphicsProgram {
	private static final int PAUSE_MS = 1;
	public void run(){
		
//		add(new GRect(100, 200), 100, 150);
//		add(new GOval(100, 200), 100, 150);
		GRect myRect = new GRect(100, 200);
		add(myRect, 100, 150);
//		GRect secondRect = new GRect(100, 200);
//		add(secondRect, 300, 100);
		GRect oldRect = myRect;
		myRect = new GRect(100, 200);
		add(myRect, 300, 150);
		oldRect.setFilled(true);
		myRect.setFilled(true);
		oldRect.setColor(Color.GREEN);
		pause(PAUSE_MS);
		oldRect.setLocation(10,10);
//		oldRect.move(100,100);
	}
}
