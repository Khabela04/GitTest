import acm.graphics.*;
import acm.program.*;

//22. ჭადრაკის დაფის დახატვა 8x8 ზე 
public class Problem22 extends GraphicsProgram {
	public void run(){
		int n = 8;
		int boxWidth = getWidth()/n;
		int boxHeight = getHeight()/n;
		int x = 0;
		int y = 0;
		add(new GRect(boxWidth, boxHeight), x,y);
		
	}
}
