import acm.program.ConsoleProgram;

//24. მომხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს n ის გამყოფების რაოდენობა 
public class Problem24 extends ConsoleProgram {
	int divisions = 0;
	public void run(){
		int n = readInt("Give me a number: ");
		println(n+" can be divided on "+divisions(n)+" numbers");
	}
	private int divisions(int n){
		for(int i = 0; i < n; i++){
			if(n % i == 0){
				divisions += 1;
			}
		}
		return divisions;
		
	}
}
