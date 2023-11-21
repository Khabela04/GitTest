import acm.program.ConsoleProgram;

public class Problem48 extends ConsoleProgram {
	int counter;
	public void run(){
		String text = "mariami";
		printCharStatistics(text);
	}

	private void printCharStatistics(String text) {
		for(int i = 0; i < text.length(); i++){
			char currCh = text.charAt(i);
			if(isFirstOccurance(text, i )){
				int count = counter(text, currCh);
				println(currCh + " is used " + count);
		}
			}
		
	}
	private boolean isFirstOccurance(String text, int i) {
		return text.indexOf(text.charAt(i)) == i;
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
