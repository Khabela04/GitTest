import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

//წარმოიდგინეთ შემდეგი მიმდევრობა. მიმდევრობის პირველი წევრი ნატურალური რიცხვი n-ია.
//იმისათვის, რომ შემდეგი წევრი მივიღოთ უნდა ავაგდოთ მონეტა.
//მონეტის აგდების შედეგად თუკი ამოვიდა გერბი მაშინ შემდეგი წევრია n/2(მთელი რიცხვების გაყოფა),
//ხოლო თუკი ამოვიდა საფასური მაშინ შემდეგი წევრია n-1. მიმდევრობის ყოველი შემდეგი წევრიც იგივე წესებით მოიცემა - 
//მიმდევრობის წინა წევრს ან ორზე ვყოფთ ან ერთს ვაკლებთ. ასე ვაგრძელებთ მანამ სანამ არ მივიღებთ 0-ს. 
//თქვენი ამოცანაა დაწეროთ მეთოდი countSequence რომელსაც გადაეცემა მიმდევრობის პირველი წევრი n 
//და რომელიც აბრუნებს საშუალოდ რამდენი წევრი აქვს მიმდევრობას. 
//გაითვალისწინეთ, რომ ამ ამოცანაში საკვანძო სიტყვაა საშუალოდ. შედეგის გამოსათვლელად თქვენ უნდა ჩაატაროთ ექსპერიმენტები. ყოველ ექსპერიმენტზე უნდა დაიწყოთ n-იდან მოახდინოთ სიმულაცია ჩვენი წესების და მიიღოთ მიმდევრობის სიგრძე. საკმარისი რაოდენობის(EXPERIMENT_COUNT) ექსპერიმენტის ჩატარების შემდეგ თქვენ შეგიძლიათ გამოთვალოთ საშუალოდ რამდენი წევრი აქვს n-ით დაწყებულ მიმდევრობას. 
//ამოცანა შეასრულეთ CountSequence.java ფაილში 

public class midterm2017_4 extends ConsoleProgram {
	RandomGenerator rgen = RandomGenerator.getInstance();
	int n1 = 1;
	int counter = 0;
	int n2 = 1;
	public void run(){
		for(int i = 0; i < 1000; i++){
			countSequence(n1);
			n1 =1;
			n2 = 1;
		}
		double average = counter/1000.0;
		println(average);
		
		
	}
	private void countSequence(int n1) {
		while(n2 != 0){
			boolean isGerbi = rgen.nextBoolean();
			if(isGerbi){
				n2 = n1/2;
			}else{
				n2 = n1-1;
			}
			n1 = n2;
			counter++;
		}
		
	}
}
