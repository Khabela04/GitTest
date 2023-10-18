import acm.graphics.*;
import acm.program.*;

//22. ჭადრაკის დაფის დახატვა 8x8 ზე 
public class Problem22 extends GraphicsProgram {
	public void run(){
		add(new GRect(20,20), 0, 0);
		add(new GRect(20,20),0+20, 0);
	}
}
