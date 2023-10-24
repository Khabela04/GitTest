import acm.program.ConsoleProgram;

public class Problem025 extends ConsoleProgram {
	public void run(){
		int n = readInt("Enter n: ");
		int m = readInt("Enter n: ");
		int gcd = gcd(n, m);
		println("GCD is " +gcd);
	}
	private int gcd(int n, int m){
		for (int i = Math.min(m, n); i >= 1; i--){
			if(n % i ==0 && m % i == 0){
				return i;
			}
		}
		return m;
		
	}
}