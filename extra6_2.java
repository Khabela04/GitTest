import acm.program.ConsoleProgram;

public class extra6_2 extends ConsoleProgram{
	public void run(){
		double num1 = readInt("Give me the first number: ");
		double num2 = readInt("Give me the second number: ");
		String symbole = readLine("Give me the operation symbol");
		char symbol = symbole.charAt(0);
		if(symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/'){
			double product = operation(symbol, num1, num2);
			println(product);
		}
	}
	private double operation(char symbol, double num1, double num2){
		if(symbol == '+'){
			return num1+ num2;
		}
		if(symbol == '-'){
			return Math.abs(num1-num2);
		}
		if(symbol == '*'){
			return num1*num2;
		}
		else{
			return num1/num2;
		}
	}
}
