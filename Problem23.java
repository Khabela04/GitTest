import acm.program.ConsoleProgram;
//23. მომხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს 1 დან n მდე რიცხვების ჯამი 
public class Problem23 extends ConsoleProgram {
	public void run(){
		int n = readInt("Give me a number");
		int sum = 0;
		for(int i = 0; i < n; i++){
			sum += i;
		}
		println(sum);
	}
}
