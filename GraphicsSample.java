import acm.graphics.*;
import acm.program.GraphicsProgram;

public class GraphicsSample extends GraphicsProgram {
	public void run(){
		
//		add(new GRect(100, 200), 100, 150);
//		add(new GOval(100, 200), 100, 150);
		GRect myRect = new GRect(100, 200);
		add(myRect, 100, 150);
		GRect secondRect = new GRect(100, 200);
		add(secondRect, 300, 100);
	}
}
