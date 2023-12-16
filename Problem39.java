import java.awt.Component;

import acm.graphics.GOval;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
//დაწერეთ პროგრამა სადაც იქნება კანვასზე ბურთის მოძრაობა მარცხენა კედლის შუა წერტილიდან მარჯვენა კედლამდე. 
public class Problem39 extends GraphicsProgram {
	private static final int RADIUS = 50;
	
	public void run(){
		GOval Myoval = new GOval (2*RADIUS, 2* RADIUS);
		add(Myoval, 0, 100);
	}
}
