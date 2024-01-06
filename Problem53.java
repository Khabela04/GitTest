import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

public class Problem53 extends ConsoleProgram{
	String text = " ";
	private static final String FILE_NAME = "text.java";
	int symbolCount = 0;
	int wordsCount = 0;
	int sentenceCount = 0;
	int questions = 0;
	int fullStopCount = 0;
	int exclamations = 0;
	public void run(){
		try {
			BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
			while(true){
				text = reader.readLine();
				if(text == null){
					break;
				}
				symbolsCounter(text);
				wordsCounter(text);
				questionMarks(text);
				fullStops(text);
				exclamationMark(text);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		println("In this text there is " + symbolCount + " symbols");
		println("In this text there is " + wordsCount + " words");
		println("In this text there is " + sentenceCount + " sentences");
		println("In this text there is " + questions + " question marks");
		println("In this text there is " + fullStopCount + " fullstops");
		println("In this text there is " + exclamations + " exclamation marks");
	}
	private void exclamationMark(String text2) {
		for(int i = 0; i < text2.length(); i++){
			if(text.charAt(i) == '!'){
				exclamations ++;
				sentenceCount ++;
			}
		}
		
	}
	private void fullStops(String text2) {
		for(int i = 0; i < text2.length(); i++){
			if(text.charAt(i) == '.'){
				fullStopCount++;
				sentenceCount ++;
			}
		}
		
	}
	private void questionMarks(String text2) {
		for(int i = 0; i < text2.length(); i++){
			if(text.charAt(i) == '?'){
				questions++;
				sentenceCount++;
			}
		}
		
	}
	private void wordsCounter(String text2) {
		for(int i = 0; i < text2.length(); i++){
			if(text2.charAt(i) == ' '){
				wordsCount++;
			}
		}
	}
	private void symbolsCounter(String text2) {
		for(int i = 0; i <text2.length(); i++){
			if(text2.charAt(i) != ' '){
				symbolCount ++;
			}
		}
	}
}
