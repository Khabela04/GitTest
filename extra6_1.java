import acm.program.ConsoleProgram;

public class extra6_1 extends ConsoleProgram{
	public void run(){
		int number = 1;
		int blank = 0;
		while(number != 0){
			number = readInt("Give me a number");
			blank += number;
		}
		println(blank);
	}
}
