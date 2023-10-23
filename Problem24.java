import acm.program.ConsoleProgram;

//24. მომხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს n ის გამყოფების რაოდენობა 
public class Problem24 extends ConsoleProgram {
	public void run(){
		int n = readInt("Give me a number: ");
		int division = 0;
		for(int i = 0; i < n; i++){
			division += 1;
		}
		println(n+" can be divided on "+ division +" numbers");
	}
//	private int divisions(int n){
//		int divisions = 0;
//		for(int i = 0; i < n; i++){
//			if(n % i == 0){
//				divisions += 1;
//			}
//		}
//		return n;
//		
//	}
}
