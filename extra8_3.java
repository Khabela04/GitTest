import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class extra8_3 extends GraphicsProgram{
	public void run(){
		int n = 5;
		addSquares(10*fib(n), 0, 10 );
	}
	private void addSquares(int length, int y, int border) {
		for(int i = 0; i < 5; i++){
			GRect square = new GRect(length, length);
			int x = 0;
			add(square, x, y);
			x += border;
		}
		
	}
	private int fib(int n){
		int prevNum = 1;
		int nextNum = 0;
		int curNum = 0;
		for(int i = 0; i < n; i ++){
			curNum = nextNum;
			nextNum = curNum + prevNum;
			prevNum = curNum;
		}
		return curNum;
// 	0, 1, 1, 2, 3, 5 ......
	}
}
