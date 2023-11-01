import acm.program.ConsoleProgram;
//30. მომხმარებელს შეყავს მთელი რიცხვი, დაბეჭდეთ რიცხვი რომელიც მიიღება ციფრების შებრუნებით, 1256 -> 6521 
public class Problem030 extends ConsoleProgram {
	public void run(){
		int num = readInt("Give me a number: ");
		int rev = rev(num);
		println(rev);
	}
	private int rev(int n){
		int revnum = 0;
		while(n != 0){
			int lastDigit = n % 10;
			n /=10;
			int revnum = revnum*10+lastDigit;
		}
		return revnum;
	}
}
