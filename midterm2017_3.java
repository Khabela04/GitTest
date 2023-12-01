import acm.program.ConsoleProgram;

public class midterm2017_3 extends ConsoleProgram{
	public void run(){
		while(true){
		String text1 = readLine("Give me a word: ");
		String text2 = readLine("Give me a word: ");
		boolean indicator = true;
		for(int i = 0; i < text2.length(); i++){
			char letter2 = text2.charAt(i);
				if(text1.indexOf(letter2) == -1){
					indicator = false;
					break;
				}
				if(isUsedMultiple(text1,text2,letter2)){
					indicator = false;
					break;
				}
		}
		if(indicator){
			println("You can do it");
		}else{
			println("You can't do it");
		}
	}
	}

	private boolean isUsedMultiple(String text1, String text2, char letter2) {
		int counter = 0;
		int counter2 = 0;
		for(int i = 0; i < text1.length(); i++){
			if(text1.charAt(i) == letter2){
				counter++;
			}
		}
		for(int j = 0; j < text2.length(); j++){
			if(text1.charAt(j) == letter2){
				counter2++;
			}
		}
		if(counter2 > counter){
			return true;
		}
		return false;
	}
}