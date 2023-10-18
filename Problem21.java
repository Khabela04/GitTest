import acm.graphics.*;
import acm.program.*;

//21. ხაზებით ბადის დახატვა 10x10 ზე 
public class Problem21 extends GraphicsProgram {
	public void run(){
		int n = 10;
		int l = 0;
		int m = 10;
		int x = 0;
		int y = 0;
		double boxHeight = getHeight()/n;
		double boxWidth = getWidth()/m;
		for(int i = 0; i<n+1; i++){
			add(new GLine(0, y, getWidth(), y));
			y += boxHeight;
			for(int j = 0; j<m+1; j++){
				add(new GLine(x, 0, x, getHeight() ));
				x += boxWidth;
			}
			}
		
	}
}


