import acm.program.ConsoleProgram;

//დაწერეთ მეთოდი int euclideanGCD(int x, int y) სადაც გამოთვლით x-is da y-ის უდიდეს საერთო გამყოფს ევკლიდეს ალგორითმის გამოყენებით. 
//(შეგიძლიათ ჩათვალოთ, რომ x და y  არაუარყოფითი რიცხვებია)
//ევკლიდეს ალგორითმის ნაბიჯები:
//გაქვთ ორი არაუარყოფითი მთელი რიცხვი "a" და "b", სადაც "a >= b".
//დაწერეთ while ციკლი, რომელიც გაგრძელდება მანამ, სანამ "b" არ არის ნულის ტოლი.
//ციკლის შიგნით გამოთვალეთ "a"-ს "b"-ზე გაყოფის დარჩენილი ნაშთი "r" (გამოიყენეთ ოპერატორი "%")
//განაახლეთ "a" და "b" მნიშვნელობები შემდეგნაირად:
//"a" გახდეს "b"-ის მიმდინარე მნიშვნელობის ტოლი.
//„b“ გახდეს „r“-ის მიმდინარე მნიშვნელობის ტოლი.
//(გაიმეორეთ ზემოაღნიშნული ნაბიჯები, სანამ "b" ნული გახდება. მას შემდეგ რაც "b" გახდება ნული, GCD იქნება "a"-ის მიმდინარე მნიშვნელობა.)
//დააბრუნეთ მნიშვნელობა "a", როგორც საბოლოო შედეგი.
//3 ^ 5
//3 ^0 = 1
//3^ 1 = 3
//3^2 = 3 * 3
//1 * 3* 3 * 3

public class extra8_1 extends ConsoleProgram{
	public void run(){
		double a = readInt("Give me a number: ");
		double b = readInt("Give me a number: ");
		while(b != 0){
			double r = a % b;
			a = b;
			b = r;
		}
		println(a);
	}
}
