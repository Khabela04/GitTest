import acm.program.ConsoleProgram;

//47. დაწერეთ პრედიკატ მეთოდი რომელსაც გადაეცემა სტრინგი და რომელიც დაადგენს არის თუ არა მოცემული ტექსტი პალინდრომი 
public class Practice47 extends ConsoleProgram {
	public void run(){
		String text = readLine("Give me a word: ");
		if(isPallyndrom(text)){
			println("The word " + text + " is a palyndrom");
		} else{
			println("The word " + text + " isn't a palyndrom");
		}
	}

	private boolean isPallyndrom(String text) {
		String textExample = text;
		for(int i = 0; i < text.length(); i++){
			char charecter1 = textExample.charAt(i);
			char charecter2 = textExample.charAt(textExample.length() - 1 - i);
			if(charecter1 == charecter2){
				return true;
			}
		}
		return false;
	}
}
