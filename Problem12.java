import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram {
	public void run(){
		GRect myRect = new GRect(250, 250);
		add(myRect, 250, 150);
		GRect myDoor = new GRect(40, 50);
		add(myDoor,375, 300);
	}

}
