import acm.program.ConsoleProgram;

public class extra1 extends ConsoleProgram {
	    public static String[] solution(String s) {
	      int counter = 0;
	     String [] result = new String[s.length() / 2 +1];
	    for(int i = 0; i < s.length(); i++){
	     if(s.length() % 2 == 0){
	       result[i] = s.substring(i, i+2);
	         i++;
	     }
	      else{
	        if(counter == s.length()/2){
	          result[i] = s.substring(i) + "_";
	        }
	        result[i] = s.substring(i, i+2);
	        counter ++;
	         i++;
	     }
	    }
	      return result;
	}
}
