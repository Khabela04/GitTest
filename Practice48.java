import acm.program.ConsoleProgram;

//48. კონსოლიდან შეგყვავს ტექსტი პროგრამამ უნდა დაბეჭდოს სტატისტიკა რომელი სიმბოლო რამდენჯერ გვხვდება 
public class Practice48 extends ConsoleProgram {
	int counter;
	public void run(){
		String input = readLine("Give me a word: ");
		println(statistics(input));
	}

	private String statistics(String input) {
		for(int i = 0; i < input.length(); i++){
			char charecter1 = input.charAt(i);
			int n = charrecter(input, charecter1);
			println(charecter1 + n);
		}
		
		return null;
	}
	private int charrecter(String input, char n){
		counter = 0;
		for(int j = 0; j < input.length(); j++){
			if(input.charAt(j) == n){
				counter++;
			}
		}
		return counter;
		
	}
}
