import acm.program.ConsoleProgram;
//19. კონსოლიდან წაიკითხეთ მთელი რიცხვი n და შემდეგ n ჯერ დაბეჭდეთ “hello ” + i, სადაც i  იცვლება 0 დან n-1 მდე.  
public class Problem19 extends ConsoleProgram {
	public void run(){
		double n = readDouble("Give me a number");
		for(int i=0; i<n; i++){
			println("hello World"+i);
		}
	}
}

		
	


