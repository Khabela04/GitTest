import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

//7.გაქვს 20 ლარი და თამაშობ მონეტის აგდებას, ყოველ ჯერზე დებს გერბზე 2 ლარს, წაგების შემთხვევაში კარგავს ამ 2 ლარს, 
//ხოლო მოგების შემთხვევაში იბრუნებს დადებულ ფსონს და დამატებით 1 ლარს იგებს.  საშუალოდ რა თანხა გექნება 100 აგდების შემდეგ
//(თუ თანხა გაგითავდა, ვთქვთ მე–20 აგდებაზე შენი ექსპერიმენტი რჩება და 21-ედ ვეღარ ააგდებ.
//ასეთი ექსპერიმენტი შედეგებში ჩვეულებრივ უნდა გაითვალისწინო)  ? 
//საშუალოს გამოსათვლელად ჩაატარეთ 100 ჯერ(ან ნაკლებჯერ, თუ გაკოტრდი) აგდების ექსპერიმენტი 10000 ჯერ. (Practice07)






public class midterm_pr6 extends ConsoleProgram{
	RandomGenerator rgen = RandomGenerator.getInstance();
	public void run(){
		double money = 20;
		double totalMoney = 0;
		boolean isGerb = rgen.nextBoolean();
		for(int i = 0; i < 10000; i++){
			money = 20;
			for(int j = 0; j < 100; j++){
				if(money >1){
					money -= 2;
					if(isGerb){
						money += 3;
					}
				}else{
					break;
				}
			}
			totalMoney += money;
		}
		double averageMoney = totalMoney/ 10000;
}
}