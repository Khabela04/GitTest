import acm.program.ConsoleProgram;

public class midterm2021_2 extends ConsoleProgram{
	public void run(){
		println(amIYourFatherLuke("CGAT", "CCTGACT")); // უნდა დაბეჭდოს false
		println(amIYourFatherLuke("GATTA", "TTGATTT")); // უნდა დაბეჭდოს true		
		println(amIYourFatherLuke("GAT", "TTGAT")); // უნდა დაბეჭდოს true
		println(amIYourFatherLuke("GAT", "TTTGAT")); // უნდა დაბეჭდოს false
	}

	private boolean amIYourFatherLuke(String lukeDNA, String anakinDNA){
		int maxLength = 0;
		for(int i = 0; i < lukeDNA.length(); i++){
			for(int j = i+1; j < anakinDNA.length(); j++){
				String substr = lukeDNA.substring(i, j);	// C
				if(anakinDNA.indexOf(substr) == -1){
					break;
				}
				maxLength = Math.max(maxLength, substr.length());
			}
		}
			if(maxLength >= anakinDNA.length()/2 + 1){
				return true;
			}
		return false;
	}
}
