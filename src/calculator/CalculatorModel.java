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

	// Ziffer in Zwischenspeicher input einfügen
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
	// Zwischenspeicher löschen, Summe auf 0 --> wenn C-Button gedrückt wird
	public String erase() {
		this.input="";
		this.sum=0;
		return this.input;
	}
	
	/* Zeichenkette input wird mit Zerlegt nach Delimiter (+)
	   Jedes Token wird zur Summe addiert. Summe wird zurückgegeben*/
	public String equals() {
		lineScanner=new Scanner(input);
		lineScanner.useDelimiter("\\+");
		while (lineScanner.hasNext()) {
		
		sum+=lineScanner.nextInt();
		}
		this.input = sum+"";
	
			
		return sum+"";
	}
	// Löschung des Zwischenspeichers Summe, nach Betätigung btnEquals
	public void eraseSum() {
		this.sum=0;
	}

}
