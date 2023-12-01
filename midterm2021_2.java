import acm.program.ConsoleProgram;

public class midterm2021_2 extends ConsoleProgram{
	String maxString= "";
	public void run(){
		String Luka = readLine("Give me Lukas's DNA: ");
		String Anakin = readLine("Give me Anakin's DNA: ");
		println(amIYourFatherLuke(Luka, Anakin));
		println(maxString);
	}
	private boolean amIYourFatherLuke(String Luka, String Anakin){
		for(int i = 0; i < Luka.length(); i++){
			String LukaPart = Luka.substring(0, i);	//LU
			for(int j = 0; j < Anakin.length(); j++){
			String AnakinPart = Anakin.substring(0,j);
			if(LukaPart.equals(AnakinPart)){
				checkMaximum(LukaPart);
			}
		}
		if(!maxString.equals("")){
			return true;
		}
		}
		return false;
	}
	private void checkMaximum(String LukaPart){
		int maximumLength = 0;
		if(LukaPart.length()>maximumLength){
			maximumLength = LukaPart.length();
			maxString = ""+LukaPart;
		}
		
	}
}
