import acm.graphics.*;
import acm.program.*;

//21. ხაზებით ბადის დახატვა 10x10 ზე 
public class Problem21 extends GraphicsProgram {
	public void run(){
		int n = 10;
		int m = 10;
		int x = 0;
		int y = 0;
		double boxHeight = 400/n;
		double boxWidth = 400/m;
		for(int i = 0; i<n; i++){
			add(new GLine(0, y, 400, y));
			y += boxHeight;
			}
	}

}
