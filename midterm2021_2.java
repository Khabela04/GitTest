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
			//!! to include substring at the end =>  j < lukeDNA.length() + 1
			for(int j = i + 1; j < lukeDNA.length() + 1; j++){
				String currSubs = lukeDNA.substring(i, j);
				if(anakinDNA.indexOf(currSubs) == -1){
					break;
				}
				maxLength = Math.max(maxLength, currSubs.length());
			}
		}
		return maxLength > anakinDNA.length() / 2.0;
	}
}
