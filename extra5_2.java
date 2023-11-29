import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class extra5_2 extends GraphicsProgram{
	private static final int HOUSE_WIDTH = 40;
	private static final int HOUSE_HEIGHT = 40;
	private static final int DOOR_WIDTH = 8;
	private static final int DOOR_HEIGHT = 13;
	private static final int WINDOWS_HEIGHT = 6;
	private static final int WINDOWS_WIDTH = 6;
	private static final int DIFF_WINDOWS = 20;
	GLine line;
	public void run(){
		double xStart = (getWidth() - HOUSE_WIDTH)/2;
		double yStart = (getHeight() - HOUSE_HEIGHT)/2;
		double xEnd = (getWidth() - HOUSE_WIDTH)/2 + HOUSE_WIDTH/2;
		double yEnd = (getHeight() - HOUSE_HEIGHT)/2 - HOUSE_HEIGHT/2;
		double x1Start =  (getWidth() - HOUSE_WIDTH)/2 + HOUSE_WIDTH/2 ;
		double y1Start = (getHeight() - HOUSE_HEIGHT)/2 - HOUSE_HEIGHT/2;
		double x1End = (getWidth() - HOUSE_WIDTH)/2 + HOUSE_WIDTH;
		double y1End = (getHeight() - HOUSE_HEIGHT)/2;
		
		GRect house = new GRect (HOUSE_WIDTH, HOUSE_HEIGHT);
		GRect door = new GRect (DOOR_WIDTH, DOOR_HEIGHT);
		GRect window1 = new GRect (WINDOWS_WIDTH, WINDOWS_HEIGHT);
		GRect window2 = new GRect (WINDOWS_WIDTH, WINDOWS_HEIGHT);
		add(house, (getWidth() - HOUSE_WIDTH)/2, (getHeight() - HOUSE_HEIGHT)/2);
		add(door, (getWidth() - HOUSE_WIDTH)/2 + (HOUSE_WIDTH - DOOR_WIDTH)/2, (getHeight() - HOUSE_HEIGHT)/2 + HOUSE_HEIGHT - DOOR_HEIGHT);
		add(window1,  (getWidth() - HOUSE_WIDTH)/2 + (HOUSE_WIDTH - 2 * WINDOWS_WIDTH - DIFF_WINDOWS)/2, (getHeight() - HOUSE_HEIGHT)/2 + 5); 
		add(window2,  (getWidth() - HOUSE_WIDTH)/2 + (HOUSE_WIDTH - 2 * WINDOWS_WIDTH - DIFF_WINDOWS)/2 + DIFF_WINDOWS, (getHeight() - HOUSE_HEIGHT)/2 + DIFF_WINDOWS);
		add(new GLine(xStart, yStart, xEnd, yEnd));
		add(new GLine(x1Start, y1Start,x1End, y1End));
	}
}

