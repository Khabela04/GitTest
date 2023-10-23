import acm.program.ConsoleProgram;
//25. მომხმარებელს შეჰყავს ორი რიცხვი თქვენმა პროგრამამ უნდა დაბეჭდოს ამ ორი რიცხვის უმცირესი საერთო ჯერადი. 
public class Problem25 extends ConsoleProgram {
	public void run(){
		int n = readInt("Give me the first number: ");
		int m = readInt("Give me the second number: ");
		int mult = n*m;
		if(mult/2 % n ==0){
			if(mult/2 % m ==0){
				println(mult/2);
			}
		}
		else{
			println(mult);
		}
	}

}

