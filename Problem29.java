import acm.program.ConsoleProgram;
//29. მოხმარებელს შეყავს მთელი რიცხვი n, პროგრამამ უნდა დაბეჭდოს ფიბონაჩის მიმდევრობის
//მე n წევრი.
public class Problem29 extends ConsoleProgram {
	public void run(){
		int n = readInt("Give me a number");
		println("the " + n + "th number of Fibonachi is" + fibN(n));
	}


//		0, 1, 1, 2, 3, 5, 8
	}
}
