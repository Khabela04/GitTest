import acm.graphics.*;
import acm.program.*;

//22. ჭადრაკის დაფის დახატვა 8x8 ზე 
public class Problem22 extends GraphicsProgram {
	public void run(){
		int x = 0;
		int y = 0;
		for(int i = 0; i<4; i++){
		for(int j = 0; j<4; j++){
		add(new GRect(20,20), x, y);
		GRect myRect = new GRect(20,20);
		myRect.setFilled(true);
		x += 20;
		add(myRect,x, y);
		x += 20;
		
	
	}
		y +=20;
		x -= 160;
		for(int l = 0; l<4; l++){
			GRect myRect = new GRect(20,20);
			
			add(myRect,x, y);
			myRect.setFilled(true);
			x +=20;
			add(new GRect(20,20), x, y);
			x +=20;
			}
		x -=160;
		y -=160;
		}
}
}
