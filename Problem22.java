import acm.graphics.*;
import acm.program.*;

//22. ჭადრაკის დაფის დახატვა 8x8 ზე 
public class Problem22 extends GraphicsProgram {
	public void run(){
		int n = 8;
		int m = 8;
		int x = 0;
		int y = 0;
		double boxHeight = 64/n;
		double boxWidth = 64/m;
		for(int i = 0; i<n+1; i++){
			add(new GLine(0, y, 64, y));
			y += boxHeight;
		}
			for(int j = 0; j<m+1; j++){
				add(new GLine(x, 0, x, 64 ));
				x += boxWidth;
			}
	}

}
