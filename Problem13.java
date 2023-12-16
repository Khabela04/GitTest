import acm.graphics.*;
import acm.program.GraphicsProgram;

//დაწერეთ პროგრამა, რომლიც ეკრანის შუაში გაავლებს ჰორიზონტალურ ხაზს
public class Problem13 extends GraphicsProgram {
	public void run() {
		int height = getHeight();
		int width = getWidth();
		add(new GLine(0, height / 2, width, height / 2));
		
	}
}
