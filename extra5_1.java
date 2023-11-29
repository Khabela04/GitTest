import java.awt.Color;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class extra5_1 extends GraphicsProgram{
	public void run(){
		double x = getWidth();
		double y = getHeight();
		GLabel text = new GLabel("width: " + x + "height: " + y);
		text.setFont("London");
		text.setColor(Color.RED);
		add(text, (getWidth() - text.getWidth())/2, getHeight()/2 + text.getHeight()/2);
	}
}


