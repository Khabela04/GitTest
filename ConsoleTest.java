import acm.program.ConsoleProgram;

public class ConsoleTest extends ConsoleProgram {
	public void run(){
	int kids = readInt("Enter number of your kids: ");
	println("Your kid's number is"+kids);
	int firstNum = readInt("Enter the first num: ");
	int secondNum = readInt("Enter the first num: ");
	int avg = (firstNum+secondNum)/2;
	println("Average is "+avg);

}
}
