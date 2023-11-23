import acm.program.ConsoleProgram;

public class Problem49 extends ConsoleProgram {
	public void run(){
		String numSt = "1234";
		int num = stringToInt(numSt);
		println(num-1);
	}
	private int stringToInt(String n){
		int num = 0;
		for(int i = 0; i < n.length(); i++){
			char currCh = n.charAt(i);
			int currDigit = n.charAt(i) - '0';
			num = num * 10 + currDigit;
		}
		return num;
	}
}
