import acm.program.ConsoleProgram;

//26. მომხმარებელს შეჰყავს ორი რიცხვი თქვენმა პროგრამამ უნდა დაბეჭდოს ამ ორი რიცხვის უდიდესი საერთო გამყოფი 
public class Problem26 extends ConsoleProgram {
	public void run(){
		double n = readInt("Give me the first number ");
		double m = readInt("Give me the second number ");
		double mult = n*m;
		double jer = 0;
		for(double i = 2; i < n+1; i++){
			if(mult/i % n ==0){
				if(mult/i % m ==0){
					jer = mult/i;
				}
			}
		}
		if(jer == 0.0){
			println(n*m/mult);
		}
		else{
		println(n*m/jer);
		}
	}
}
