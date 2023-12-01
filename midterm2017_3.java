import acm.program.ConsoleProgram;

public class midterm2017_3 extends ConsoleProgram{
	public void run(){
		String text1 = "gamarjoba";
		String text2 = "baro";
		for(int i = 0; i < text2.length(); i++){
			char letter2 = text2.charAt(i);
				if(text1.indexOf(letter2) == -1){
					println("can't do");
					break;
				}
		}
	}
}