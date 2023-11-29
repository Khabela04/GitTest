import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class extra8_3 extends GraphicsProgram{
	public void run(){
		int n = 4;
		int x = 0;
		for(int i = 0; i < 5; i++){
			int y = 0;
			addSquares(10*fib(n), x, y);
			x += 10;
		}
	}
	private void addSquares(int length, int x, int y) {
			GRect name = new GRect(length, length);
			add(name, x, y);
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
