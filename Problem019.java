import acm.program.ConsoleProgram;
//19. კონსოლიდან წაიკითხეთ მთელი რიცხვი n და შემდეგ n ჯერ დაბეჭდეთ “hello ” + i, სადაც i  იცვლება 0 დან n-1 მდე.  
public class Problem019 extends ConsoleProgram {
	public void run(){
		int n = readInt("Enter n: ");
		for (int i = 0; i < n; i++){
			println("hello "+i);
		}
	}
}
