import acm.program.ConsoleProgram;

public class Problem023 extends ConsoleProgram {
	public void run(){
		int n = readInt("Enter n: ");
		int sum = calculateSum(n);
		println("sum of number 1...n is: " + sum);
	}

	private int calculateSum(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 0; i <= n; i++){
			sum += i;
		}
		return sum;
	}
}
