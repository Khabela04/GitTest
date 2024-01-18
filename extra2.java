
import java.lang.Math;

import acm.program.ConsoleProgram;
public class extra2 extends ConsoleProgram {
	public  void run(){
		solution("saba");
	}
	    public void solution(String s) {
	      String[] result = new String[(int)Math.ceil(s.length()/2)];
        for(int i = 0; i < s.length(); i+=2){
          if(i+1 < s.length()){
            result[i] = s.substring(i,i+2);
          }else{
            result[i] = s.substring(i) + "_";
          }
        }
	      printer(result);
	}
	    public void printer(String [] n){
	    	String blank = "";
	    	for(int i = 0; i<n.length; i++){
	    		blank+= n[i];
	    	}
	    	println(blank);
	    }
}
