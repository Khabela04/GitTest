import acm.graphics.*;
import acm.program.*;

public class CheckerBord extends GraphicsProgram {
	public void run(){
		int rowsNum = 8;
		int columnsNum = 8;
		for(int i = 0; i < rowsNum; i++){
			for(int j = 0; i < columnsNum; i++){
				double x = j*getWidth()/columnsNum;
				double y = i*getHeight()/rowsNum;
				GRect myRect = new GRect(x, y, getWidth()/columnsNum, getHeight()/rowsNum);
				add(myRect);
			}
		}
	}

}
