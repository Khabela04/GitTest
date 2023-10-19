import acm.graphics.*;
import acm.program.*;

public class CheckerBord extends GraphicsProgram {
	public void run(){
		int rowsNum = 8;
		int columnsNum = 8;
		for(int i = 0; i < rowsNum; i++){
			for(int j = 0; j < columnsNum; j++){
				double x = j*getHeight()/rowsNum;
				double y = i*getHeight()/rowsNum;
				GRect myRect = new GRect(x, y, getHeight()/rowsNum, getHeight()/rowsNum);
				add(myRect);
				if(1+j%2 != 0){
					myRect.setFilled(true);
				}
			}
		}
	}

}
