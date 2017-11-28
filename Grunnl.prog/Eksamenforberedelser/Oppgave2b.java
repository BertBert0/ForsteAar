import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;
import java.io.*;
import java.util.*;

public class Oppgave2b extends EasyGraphics {

public static void main(String[] args) {
launch(args);


}
public void run(){
	makeWindow("Easy Regning",500,250);
int antRette = 0;
int fasit=0;
int svar=0;
String oppgaveTekst;
	for (int nr=1;nr<=10 ;nr++ ) {
		setColor(0,0,0);
	drawCircle(45*nr,220, 20);	
	int tall1 = trekkTall(1,9);
	int tall2 = trekkTall(1,9);
	// Trekker tilfeldig regneoperasjon
	int regneOp = trekkTall(1,2);
	oppgaveTekst = "Oppgave nr. " + nr;
	drawString(oppgaveTekst,25,50);
	// Hvis trekktall er 1, så pluss stykke
	if (regneOp == 1){
		fasit = tall1+tall2;
	
	svar = parseInt(getText(tall1 + " + " + tall2 + " = "));
	}	
		if (fasit == svar){
			setColor(0,255,0);
			fillCircle(45*nr,220, 20);
		}
			else {
				setColor(255,0,0);
				fillCircle(45*nr,220, 20);
		}
		if (regneOp == 2) {
			while (tall1<tall2){
			tall1 = trekkTall(1,9);
			tall2 = trekkTall(1,9);
			fasit = tall1-tall2;
			svar = parseInt(getText(tall1 + " - " + tall2 + " = "));

			}
		}
				if (fasit == svar){
			setColor(0,255,0);
			fillCircle(45*nr,220, 20);
		}
			else {
				setColor(255,0,0);
				fillCircle(45*nr,220, 20);
}




	}


	
		
	}

	// Metode for å trekke et tilfeldig heltall i området min - max    
  private static int trekkTall(int min, int max) {
    return min + (int)(Math.random()*(max-min+1) );
  }
}