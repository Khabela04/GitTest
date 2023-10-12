import acm.graphics.*;
import acm.program.GraphicsProgram;
//დახატეთ რობოტის სახე ფანჯრის ცენტრში.
public class Problem14 extends GraphicsProgram{
	public void run(){
		int height = getHeight();
		int width = getWidth();
		GRect Face = new GRect(100, 100);
		add(Face, (width-100)/2, (height-100)/2);
	}

}
