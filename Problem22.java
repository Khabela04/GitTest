import acm.graphics.*;
import acm.program.*;

//22. ჭადრაკის დაფის დახატვა 8x8 ზე 
public class Problem22 extends GraphicsProgram {
	public void run(){
		int x = 0;
		int y = 0;
		for(int i = 0; i<4; i++){
		add(new GRect(20,20), x, y);
		GRect myRect = new GRect(20,20);
		myRect.setFilled(true);
		x += 20;
		add(myRect,x, y);
		x += 20;
		
	
	}
		for(int i = 0; i<4; i++){
			y +=20;
			GRect myRect = new GRect(x-160,y);
			myRect.setFilled(true);
			add(myRect,x, y);
			
		
		}
}
}
