import acm.program.ConsoleProgram;

public class Probelm27 extends ConsoleProgram {
	public void run(){
		int n = readInt("Give me the number: ");
		int m = readInt("Give me the power: ");
		println(n + "^" + m + " is " + power(n,m));
	}

	private int power(int n, int m) {
		int product = 1;
		for(int i = 0; i < m; i ++ ){
			product *= n;
		}
		return product;
	}
}
