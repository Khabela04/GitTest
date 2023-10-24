import acm.program.ConsoleProgram;

public class Problem023 extends ConsoleProgram {
	public void run(){
		int n = readInt("Enter n: ");
		int sum = calculateSum(n);
		println("sum of number 1...n is: " + sum);
		println(numberOfDivisors(n));
	}

	private int calculateSum(int n) {
		int sum = 0;
		for(int i = 0; i <= n; i++){
			sum += i;
		}
		return sum;
	}
	private int numberOfDivisors(int n){
		int num = 0;
		for(int i = 0; i <= n; i++){
			if (n % i == 0){
				num += 1;
			}
		}
		return num;
	}

}
