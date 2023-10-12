import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem012 extends GraphicsProgram {
	private static final int WIDTH = 200;
	public void run(){
		drawMidLine();
	}
	
	private void drawMidLine(){
		double x1 = 0;
		double y1 = getHeight()/2;
		double x2 = getWidth();
		double y2 = getHeight()/2;
		GLine line = new GLine(x1, y1, x2, y2);
		add(line);
		
	}
//		int width = 100;
//		width = width+20;
//		width = 200;
//		GRect rect = new GRect(width, width, width, width);
//		add(rect);
//		if(true){
//			width = 5;
//			int height = 30;
//		}
//		
//		
//	}
//	private void testVoid(){
//		
//	}

}
