

import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;


public class midterm2021_3 extends GraphicsProgram{
	private GLine point;
	double xStart = 0;
	double yStart = 0;
	public void run(){
		addMouseListeners();
	}
//	private void drawLine(){
//		point = new GLine(xStart, yStart, 0, 0);
//		add(point);
//		
//	}
	@Override
	public void mouseDragged(MouseEvent e){
		point.setEndPoint(e.getX(), e.getY());
	}
	@Override
	public void mouseClicked(MouseEvent e){
		point = new GLine(e.getX(), e.getY(),e.getX() , e.getY());
		add(point);
//		xStart = e.getX();
//		yStart = e.getY();
	}
}
