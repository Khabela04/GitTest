import acm.program.ConsoleProgram;

/*-
 * თქვენი ამოცანაა გაარკვიოთ არის თუ არა რიცხვი პალინდრომი.
 * 
 * რიცხვი პალინდრომია მაშინ და მხოლოდ მაშინ თუკი ის როგორც მარჯვნიდან მარცხნივ ისე მარცხნიდან მარჯვნივ ერთნაირად იკითხება. 
 * 
 * მაგალითად, პალინდრომებია 121, 44, 7, 13231, 6472746 და ა.შ.
 * 
 * დაწერეთ isPalindrom მეთოდი რომელსაც გადაეცემა მთელი რიცხვი და რომელიც აბრუნებს true-ს თუკი ეს რიცხვი პალინდრომია, 
 * ხოლო false-ს თუკი ეს რიცხვი პალინდრომი არ არის.
 * 
 * ამოხსნისას არ გამოიყენოთ სტრინგები, ასევე ლექციებზე ჯერ არ გარჩეული მონაცემთა სტრუქტურები(მასივები, არაილისტები და ა.შ.). 
 */


public class midterm2019_1 extends ConsoleProgram{
	public void run(){
		int number  = readInt("Give me a number");
		println(isPalindrom(number));
	}
	private boolean isPalindrom(int number){
		int rev = reversion(number);
		return rev == number;
	}
	private int reversion(int number){		//121
		int rev = 0;
		while(number != 0){
			rev = rev*10 + number % 10;			//121
			number /= 10;							//1
		}
		return rev;
	}
}
