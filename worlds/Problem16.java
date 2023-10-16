package worlds;

import acm.program.ConsoleProgram;
//16. კონსოლიდან წაიკითხეთ სამი მთელი რიცხვი და დაბეჭდეთ მათი საშუალო ჰარმონიული.  
public class Problem16 extends ConsoleProgram {
	public void run(){
		double num1 = readDouble("Write the first whole number: ");
		double num2 = readDouble("Write the second whole number: ");
		double num3 = readDouble("Write the third whole number: ");
		double HAvg = 3/((1/num1)+(1/num2)+(1/num3));
		println("Harmonic Average of these numbers is "+HAvg);
	}
}
