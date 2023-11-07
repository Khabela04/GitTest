import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

//37. რულეტკა, მომხმარებელს შეყავს 0 დან 36 მდე რიცხვი შემდეგ ხდება რულეტკის დატრიალების სიმულაცია
//კონსოლში უნდა დაიბეჭდოს ამოსული რიცხვი და მოიგო თუ არა დადებულმა რიცხვმა 
public class Problem37 extends ConsoleProgram {
	private RandomGenerator gran = RandomGenerator.getInstance();
	public void run(){
		while(true){
		int num = readInt("Choose a number between 0 and 36");
		if(num > 0 && num < 36){
			if(winnerPrize(num)){
				println("Easy pizzy you're winner with num "+ num);
			}
			else{
				print(" Sorry you lose");
			}
		}
		else{
			println("Wrong number");
		}
	}}

	private boolean winnerPrize(int num) {
		int prizeNum = gran.nextInt(0, 5);
		println("the num was "+prizeNum);
		if(prizeNum == num){
			return true;
		}
		return false;
		
	}
	
}
