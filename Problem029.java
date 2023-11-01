import acm.program.ConsoleProgram;
//29. მოხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს ფიბონაჩის მიმდევრობის მე n წევრი. 
public class Problem029 extends ConsoleProgram {
	public void run(){
		int number = readInt("Give me a number");
		int fbn = fbn(number);
		println(fbn);
	}
	private int fbn(int n){
		if(n == 0 || n == 1){
			println(n);
		}
		int prev2 = 0;
		int prev1 = 1;
		for(int i = 2; i<=n; i++){
			int cur = prev2 + prev1;
			prev2 = prev1;
			prev1 = cur;
		}
		return prev1;
	}
//	0 1 2 3 4 5 6
//	0 1 1 2 3 5 8 
}
