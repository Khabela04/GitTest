import acm.program.ConsoleProgram;

public class midterm2022_1 extends ConsoleProgram{
	public void run(){
		String text1 = "iyo arabets rostevan";
		String text2 = "sba";
		println(manipulation(text1, text2));
	}
	private boolean manipulation(String text1, String text2){
		for(int i = 1; i < text1.length(); i++){
			String part1 = text1.substring(0,i);	// i
			String part2 = text1.substring(i);		// yo arabets rostevan
			for(int j = 0; j < part1.length(); j++){
				String subPart1 = subber(part1, part1.charAt(j));
				for(int n = 0; n < part2.length(); n++){
					String subPart2 = subber(part2, part2.charAt(n));
					String modText1 = subPart1 + subPart2;
					if(modText1.equals(text2)){
						return true;
					}
				}
			}
		}
		return false;
	}
	private String subber(String part1, char charAt) {
		String blank = "";
		for(int i = 0; i < part1.length(); i++){
			if(part1.charAt(i) != charAt){
				blank += part1.charAt(i);
			}
		}
		return blank;
	}
}
