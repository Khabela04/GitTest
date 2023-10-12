import acm.graphics.*;
import acm.program.GraphicsProgram;
//დახატეთ რობოტის სახე ფანჯრის ცენტრში.
public class Problem14 extends GraphicsProgram{
	public void run(){
		int height = getHeight();
		int width = getWidth();
		GRect Face = new GRect(200, 200);
		add(Face, (width-200)/2, (height-200)/2);
		add(new GRect(50, 50), (width-250)/2, (height-250)/2);
	}

}
