

import acm.graphics.*;
import acm.program.GraphicsProgram;
//დაწერეთ პროგრამა, რომლიც ეკრანის შუაში გაავლებს ჰორიზონტალურ ხაზს
public class Problem13 extends GraphicsProgram {
	public void run() {
		GRect myRect = new GRect (80,160);
		int height = getHeight();
		int width= getWidth();
		
        add(new GLine(0, height/2, width, height/2));
	}

}
