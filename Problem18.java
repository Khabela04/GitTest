import acm.program.ConsoleProgram;

//18. კონსოლიდან წაიკითხეთ ორი მთელი რიცხვი და დაბეჭდეთ მათ შორის მაქსიმალური. 
public class Problem18 extends ConsoleProgram {
	public void run(){
		int number1 = readInt("Give me the first number ");
		int number2 = readInt("Give me the second number ");
		if(number1 > number2){
			println(number1+" is the bigger number");
		}
		if(number1 < number2){
			println(number2+" is the bigger number");
		}
	}

}
