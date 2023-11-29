import java.awt.Color;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class extra5_1 extends GraphicsProgram{
	public void run(){
		double x = getWidth();
		double y = getHeight();
		GLabel text = new GLabel("width: " + x + "height: " + y);
		text.setFont("London-42");
		text.setColor(Color.RED);
		add(text, (getWidth() - text.getWidth())/2, getHeight()/2 + text.getHeight()/2);
		GLabel coordinates = new GLabel("width: " + text.getWidth() + " height: " + text.getHeight() + " x: " + text.getX() + " y: " + text.getY());
		add(coordinates, 0, getHeight() - coordinates.getHeight());
	}
}


