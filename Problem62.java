import java.util.ArrayList;

import acm.program.ConsoleProgram;

//62. კონსოლიდან შეგვყავს სახელები, მანამ სანამ არ შევიყვანთ ცარიელ სტრინგს.
//დაბეჭდეთ სახელი და მის გასწვრივ რაოდენობა რამდენჯერ შევიყვანეთ ეს სახელი. 
public class Problem62 extends ConsoleProgram {
	ArrayList <String> names;
	public void run(){
		String name = readLine("Name: ");
		names = new ArrayList <String>();
		names.add(name);
		while(!(name.equals(""))){
			name = readLine("Name: ");
			if(!(name.equals(""))){
				names.add(name);
			}
		}
		printer(name);
	}

	private void printer(String name) {
		int counter = 0;
		int name1 = 0;
		for(int i = 0; i < names.size();i++){
			for(int j = 0; j < names.size(); j++){
				if((names.get(i).equals(names.get(j)))){
					counter++;
				}
			}
			println(names.get(i) + " " + counter);
			counter = 0;
		}
	}
}
