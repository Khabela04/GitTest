import acm.program.ConsoleProgram;

//15. კონსოლიდან წაიკითხეთ ორი მთელი რიცხვი და დაბეჭდეთ მათი საშუალო არითმეტიკული. 
public class Problem15 extends ConsoleProgram {
	public void run(){
		double num1 = readInt("Write first whole number ");
		int num2 = readInt("Write second whole number ");
		double avg = (num1+num2)/2;
		println("Average of this two numbers is "+ avg);
	}
}
