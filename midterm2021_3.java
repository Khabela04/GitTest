import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class midterm2021_3 extends GraphicsProgram{
	private GLine point;
	double xStart = 0;
	double yStart = 0;
	public void run(){
		addMouseListeners();
		drawLine();
	}
	private void drawLine(){
		point = new GLine(xStart, yStart, 0, 0);
		add(point);
		
	}
	public void MouseDragged(MouseEvent e){
		point.setEndPoint(e.getX(), e.getY());
	}
	public void MouseClicked(MouseEvent e){
		point.setEndPoint(e.getX(), e.getY());
//		xStart = e.getX();
//		yStart = e.getY();
	}
}
