import acm.graphics.*;
import acm.program.*;

//21. ხაზებით ბადის დახატვა 10x10 ზე 
public class Problem21 extends GraphicsProgram {
	public void run(){
		int n = 10;
		int m = 10;
		double boxHeight = getHeight()/n;
		double boxWidth = getWidth()/m;
		for(int i = 0; i<n; i++){
			GRect myRect = new GRect(getWidth(), boxHeight);
			add (myRect, 0, 0);
	
		}
	}

}
