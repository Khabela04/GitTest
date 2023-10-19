import acm.graphics.*;
import acm.program.*;

public class CheckerBord extends GraphicsProgram {
	public void run(){
		int rowsNum = 16;
		int columnsNum = 16;
		for(int i = 0; i < rowsNum; i++){
			for(int j = 0; j < columnsNum; j++){
				double x = j*getWidth()/columnsNum;
				double y = i*getHeight()/rowsNum;
				GRect myRect = new GRect(x, y, getWidth()/columnsNum, getHeight()/rowsNum);
				add(myRect);
				if((x+y)%2 == 0){
					myRect.setFilled(true);
				}
			}
		}
	}

}
