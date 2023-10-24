import acm.program.ConsoleProgram;

public class Problem025 extends ConsoleProgram {
	public void run(){
		int n = readInt("Enter n: ");
		while(n<=0){
			println("n should be >0");
		}
		int m = readInt("Enter n: ");
		while(m<=0){
			println("m should be >0");
		}
		int gcd = gcd(n, m);
		int lcm = lcm(n,m);
		println("lcm is "+lcm);
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
	private int lcm(int n, int m){
		return n*m/gcd(n,m);
	}
}