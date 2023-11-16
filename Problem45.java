import acm.program.ConsoleProgram;

// 45. მომხმარებელს კონსოლიდან შეჰყავს ტექსტი და სიმბოლო, თქვენმა პროგრამამ უნდა იპოვოს რამდენჯერ გვხვდება მოცემულ ტექსტში მოცემული სიმბოლო 
public class Problem45 extends ConsoleProgram {
	int counter;
	public void run(){
		String text = readLine("Give me a text: ");
		String symb = readLine("Give me a symbol: ");
		for(int i = 0; i < text.length(); i++){
			char charect = text.charAt(i);
			symb == (String)(charect);
			
		}
	}
}
