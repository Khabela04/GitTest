import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

//9. მოხმარებელს აქვს საწყისი თანხა 1000, თამაშობს მანამ სანამ არ წააგებს ყველაფერს.
//ყოველ ჯერზე დებს 10 ლარიან ფსონს 1-იანის ამოსვლაზე. ხდება რულეტკის დატრიალების სიმულაცია(0-დან 36-მდე შემთხვევითი რიცხვი),
//მოგების შემთხვევაში მოთამაშეს უორმაგედბა დადებული თანხა წაგების შემთხვევაში კი მოთამაშე კარგავს დადებულ თანხას.  
//დათვალეთ საშუალოდ რამდენ სვლაში წააგებს მოთამაშე 1000 ლარს. ამისთვის ჩაატარეთ 2000 ექსპერიმენტი. (Practice09)








public class midterm_pr9 extends ConsoleProgram{
	RandomGenerator rgen = RandomGenerator.getInstance();
	public void run(){
		int money = 1000;
		double counter = 0;
		for(int i = 0; i < 2000; i++){
			money = 1000;
			while(money != 0){
				money -= 10;
				counter++;
				if(rouletteSimulation(1)){
					money += 20;
				}
			}
		}
		println(counter/2000);
	}
	private boolean rouletteSimulation(int n){
		int winner = rgen.nextInt(0, 2);
		if(winner == n){
			return true;
		}
		return false;
	}
}
