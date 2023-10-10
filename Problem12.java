import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram {
	public void run(){
		GRect myRect = new GRect(250, 250);
		add(myRect, 250, 150);
		GRect myDoor = new GRect(80, 100);
		add(myDoor,335, 300);
		GRect myWindow = new GRect(50, 50);
		add(myWindow, 280, 190);
		GRect my2Window = new GRect(50, 50);
		add(my2Window, 450, 190);
	}

}
