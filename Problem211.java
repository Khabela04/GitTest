import acm.graphics.*;
import acm.program.*;

//21. ხაზებით ბადის დახატვა 10x10 ზე 
public class Problem211 extends GraphicsProgram {
	public void run(){
		int n = 10;
		int m = 10;
		int x = 0;
		int y = 0;
		double boxHeight = 400/n;
		double boxWidth = 400/m;
		for(int i = 0; i<n+1; i++){
			add(new GLine(0, y, 400, y));
			y += boxHeight;
		}
			for(int j = 0; j<m+1; j++){
				add(new GLine(x, 0, x, 400 ));
				x += boxWidth;
			}
	}
}
