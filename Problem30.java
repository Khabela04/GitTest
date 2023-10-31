import acm.program.ConsoleProgram;
//30. მომხმარებელს შეყავს მთელი რიცხვი, დაბეჭდეთ რიცხვი რომელიც მიიღება ციფრების შებრუნებით, 1256 -> 6521 
public class Problem30 extends ConsoleProgram {
	public void run(){
	int num = readInt("Give me a number");
	for(int i = 1; 10i<num; i++){
	int sub = num/10;
	int min = num-sub*10;
}
	}
}