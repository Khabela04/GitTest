import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

//8. რა არის ალბათობა იმისა, რომ  6 გვერდიანი კამათლის 4-ჯერ გაგორების შედეგად ზედიზედ ამოვა 2 ცალი 2-იანი. 
//ამისათვის გააკეთეთ კამათლისა და გაგორებების სიმულაცია. ჩაატარეთ 10000 ცალი ექსპერიმენტი და დათვალეთ ხდომილების ალბათობა. 
//ერთი ექსპერიმენტი არის კამათლის 4-ჯერ გაგორება. (Practice08)







public class midterm_pr8 extends ConsoleProgram{
	RandomGenerator rgen = RandomGenerator.getInstance();
	public void run(){
		double counterTwo = 0;
		double counter = 0;
		double averageTwo = 0;
		for(int j = 0; j < 10000; j++){
			counterTwo = 0;
			for(int i = 0; i < 4; i++){
				boolean isTwo = rgen.nextBoolean(1/6);		// 2 iani amovida
				if(isTwo){
					counterTwo ++;
				}else{
					counterTwo = 0;
				}
			}
			if(counterTwo >= 2){
				counter ++;
			}
		}
		averageTwo = counter / 10000;
		println(averageTwo);
	}
}
