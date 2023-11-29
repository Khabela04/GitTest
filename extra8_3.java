import acm.program.ConsoleProgram;

public class extra8_3 extends ConsoleProgram{
	public void run(){
		int n = readInt("Which number of fibonacci do you want: ");
		println(fib(n));
	}
	private int fib(int n){
		int prevNum = 0;
		int nextNum = 0;
		int curNum = 0;
		for(int i = 0; i < n; i ++){
			curNum = i;
			nextNum = curNum + prevNum;
			prevNum = curNum;
		}
		return nextNum;
// 	0, 1, 1, 2, 3, 5 ......
	}
}
