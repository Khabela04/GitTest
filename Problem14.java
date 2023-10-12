import acm.graphics.*;
import acm.program.GraphicsProgram;
//დახატეთ რობოტის სახე ფანჯრის ცენტრში.
public class Problem14 extends GraphicsProgram{
	public void run(){
		int height = getHeight();
		int width = getWidth();
		GRect Face = new GRect(200, 200);
		add(Face, (width-200)/2, (height-200)/2);
		add(new GRect(50, 50), (width-150)/2, (height-150)/2);
		add(new GRect(50, 50), (width/2)+22, (height-150)/2);
		add(new GLine(((width-150)/2)+50, (height-200), (width/2)+22, (height-200)));
		add(new GLine((width/2)+22, height-200, (width/2)+22, height-170));
		add(new GLine((width-150/2)+50, (height-200), ((width-150)/2)+50, height-170));
	}

}
