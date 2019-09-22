package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculatorModel {
	private int sum;
	private String input;
	private Scanner lineScanner;

	
	public CalculatorModel() {
		this.input="";
		this.sum=0;
	}

	// Ziffer in Zwischenspeicher input einf�gen
	public String addNumber(int input) {
		this.input+=input;
		return this.input;
		
	}
	// eingegebene Zahl wird mit einem + im String gespeichert
	public String addition() {
		this.input+="+";
		System.out.println(input);
	return this.input;
		
	}
	// Zwischenspeicher l�schen, Summe auf 0 --> wenn C-Button gedr�ckt wird
	public String erase() {
		this.input="";
		this.sum=0;
		return this.input;
	}
	
	/* Zeichenkette input wird mit Zerlegt nach Delimiter (+)
	   Jedes Token wird zur Summe addiert. Summe wird zur�ckgegeben*/
	public String equals() {
		lineScanner=new Scanner(input);
		lineScanner.useDelimiter("\\+");
		while (lineScanner.hasNext()) {
		
		sum+=lineScanner.nextInt();
		}
		this.input = sum+"";
	
			
		return sum+"";
	}
	// L�schung des Zwischenspeichers Summe, nach Bet�tigung btnEquals
	public void eraseSum() {
		this.sum=0;
	}

}
