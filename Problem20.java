import acm.program.ConsoleProgram;

//20. კონსოლიდან წაიკითხეთ n, შემდეგ წაიკითხეთ n ცალი მთელი რიცხვი და დაბეჭდეთ ჯამი 
public class Problem20 extends ConsoleProgram {
	public void run(){
		int quantity = readInt("Give me a quantity of number ");
		int sum = 0;
		for(int i = 0; i<quantity+1; i++){
			int number = readInt("Give me number ");
			sum += number;
		}
		println("Sum is"+sum);
	}

}
