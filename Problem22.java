import acm.graphics.*;
import acm.program.*;

//22. ჭადრაკის დაფის დახატვა 8x8 ზე 
public class Problem22 extends GraphicsProgram {
	public void run(){
		add(new GRect(20,20), 0, 0);
		GRect myRect = new GRect(20,20);
		myRect.setFilled(true);
		add(myRect,0+20, 0);
	
	}
}
