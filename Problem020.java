import acm.program.ConsoleProgram;

public class Problem020 extends ConsoleProgram {
	public void run(){
		int sum = 0;
		int n = readInt("Give me a quantity");
		for(int i = 0; i < n; i++){
			int number = readInt("Give me a number # " + i );
			sum += number;
			println(number);
		}
		println(sum);
	}

}
