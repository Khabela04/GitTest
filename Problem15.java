import acm.program.ConsoleProgram;

//კონსოლიდან წაიკითხეთ ორი მთელი რიცხვი და დაბეჭდეთ მათი საშუალო არითმეტიკული. 
public class Problem15 extends ConsoleProgram {
	public void run(){
		int num1 = readInt("Write first whole number ");
		int num2 = readInt("Write second whole number ");
		int avg = (num1+num2)/2;
		if(avg*2 != (num1+num2))
		{
		println("Average of this two numbers is "+ 1/2);
	}

}
}
