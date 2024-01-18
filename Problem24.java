import acm.program.ConsoleProgram;

//24. მომხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს n ის გამყოფების რაოდენობა 
public class Problem24 extends ConsoleProgram {
	public void run(){
		double n = readInt("Give me a number: ");
		println(n+" can be divided on "+ divisions(n) +" numbers");
	}
	private int divisions(double n){
		int divisions = 1;
		for(int i = 0; i < n; i++){
			if(n % i == 0){
			divisions += 1;
			}
		}
		return divisions;
	
}
}
