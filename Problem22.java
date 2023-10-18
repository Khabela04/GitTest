import acm.graphics.*;
import acm.program.*;

//22. ჭადრაკის დაფის დახატვა 8x8 ზე 
public class Problem22 extends GraphicsProgram {
	public void run(){
		int size = 256;
		int n = 8;
		int m = 8;
		int x = 0;
		int y = 0;
		double boxHeight = size/n;
		double boxWidth = size/m;
		for(int i = 0; i<n+1; i++){
			add(new GLine(0, y, size, y));
			y += boxHeight;
		
			for(int j = 0; j<m+1; j++){
				add(new GLine(x, 0, x, y ));
				x += boxWidth;
			}
		}
	}
}
