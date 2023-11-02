import acm.program.ConsoleProgram;

public class Problem032 extends ConsoleProgram {
	public void run(){
		int num = readInt("Give me a number");
		boolean primeN = primeN(num);
		println(primeN);
	}
	private boolean primeN(int n){
		for(int i = 2; i<n-1; i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
}
