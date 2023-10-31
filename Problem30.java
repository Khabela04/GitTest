import acm.program.ConsoleProgram;
//30. მომხმარებელს შეყავს მთელი რიცხვი, დაბეჭდეთ რიცხვი რომელიც მიიღება ციფრების შებრუნებით, 1256 -> 6521 
public class Problem30 extends ConsoleProgram {
	public void run(){
	int num = readInt("Give me a number");
	for(double i = 0; Math.pow(10,i)<num; i++){
	int sub = (int)(num/(Math.pow(10,i)));
	double min = num-sub*Math.pow(10,i);
	println(min);
}
	
	
	}
}