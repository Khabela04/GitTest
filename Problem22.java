import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

//22. ჭადრაკის დაფის დახატვა 8x8 ზე 
public class Problem22 extends GraphicsProgram {
	public void run(){
		int x = 0;
		int y = 0;
		int n = 8;
		int size = getHeight();
		int cubeHeight = size/n;
		int cubeWidth = size/n;
		for(int i = 0; i<4; i++){
		for(int j = 0; j<n/2; j++){
		add(new GRect(cubeWidth,cubeHeight), x, y);
		GRect myRect = new GRect(cubeWidth,cubeHeight);
		myRect.setFilled(true);
		x += cubeWidth;
		add(myRect,x, y);
		x += cubeWidth;
		
	
	}
		y +=cubeHeight;
		x -= n*cubeWidth;
		for(int l = 0; l<n/2; l++){
			GRect myRect = new GRect(cubeWidth,cubeHeight);
			
			add(myRect,x, y);
			myRect.setFilled(true);
			myRect.setColor(Color.RED);
			x +=cubeWidth;
			add(new GRect(cubeWidth,cubeHeight), x, y);
			x +=cubeWidth;
			}
		x -= 8*cubeWidth;
		y += cubeHeight;
		}
}
}
