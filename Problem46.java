import acm.program.ConsoleProgram;

//46. დაწერეთ მეთოდი რომელსაც გადაეცემა სტიგნი და რომელიც აბრუნებს ამ სტრინგში ყველაზე ხშირ სიმბოლოს. 
public class Problem46 extends ConsoleProgram {
	char symbol;
	int counter;
	char maxChar = 0;

	public void run() {
		String text = readLine("Give me a text: ");
		int maxCount = 0;
		for(int i = 0; i < text.length(); i++){
			int numOCC = counter(text, text.charAt(i));
			if(numOCC>maxCount){
				maxCount = numOCC;
				maxChar = text.charAt(i);
			}
		}
		println("max char: " + maxChar);
		
	
	}
	private int counter(String text, char symbol){
		for (int i = 0; i < text.length(); i++) {
			char index = text.charAt(i);
			if (symbol == index) {
				counter++;
			}
		}
		return counter;
	}
}