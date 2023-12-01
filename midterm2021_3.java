

import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GPoint;
import acm.program.GraphicsProgram;


public class midterm2021_3 extends GraphicsProgram{
	GPoint point;
	GLine line;
	double startX = 0;
	double startY = 0;
	boolean indicator = false;
	public void run(){
		addMouseListeners();
		addPoint();
		addLine();
	}
	private void addPoint(){
		point = new GPoint(0,0);
	}
	private void addLine(){
		startX = point.getX();
		startY = point.getY();
		line = new GLine(startX, startY, 0, 0);
	}
	public void mouseClicked(MouseEvent e){
		add(line);
		line.setEndPoint(e.getX(), e.getY());
		point = new GPoint(e.getX(), e.getY());
	}
}
	