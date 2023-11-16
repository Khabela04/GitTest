import acm.program.ConsoleProgram;

// 45. მომხმარებელს კონსოლიდან შეჰყავს ტექსტი და სიმბოლო, თქვენმა პროგრამამ უნდა იპოვოს რამდენჯერ გვხვდება მოცემულ ტექსტში მოცემული სიმბოლო 
public class Problem45 extends ConsoleProgram {
	int counter;
	public void run(){
		String text = readLine("Give me a text: ");
		String symb = readLine("Give me a symbol: ");
		char symbol = symb.charAt(0);
		for(int i = 0; i < text.length(); i++){
			char index = text.charAt(i);
			if(symbol == index){
				counter++;
			}
		}
		println(counter);
	}
}

