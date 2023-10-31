import acm.program.ConsoleProgram;
//30. მომხმარებელს შეყავს მთელი რიცხვი, დაბეჭდეთ რიცხვი რომელიც მიიღება ციფრების შებრუნებით, 1256 -> 6521 
public class Problem30 extends ConsoleProgram {
	public void run(){
	int num = readInt("Give me a number");
	int reverse = rev(num);
	println(reverse);
	}
	private int rev(int n){
		int reversedNum = 0;
		while(n != 0){
			int lastDigit = n % 10;
			n /= 10;
			reversedNum = reversedNum*10+lastDigit;
		}
		return reversedNum;
	}
}