/* Verktøyklasse.
 * Samling av metoder som kan brukes av
 * mange program senere.
 */
import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
//import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;

public class MineMetoder {
	
	// Metoden avrunder desimaltall til 1 siffer etter komma
	public static double avrund1(double des) {
		return (int)(des*10 + 0.5)/10.0;
	}

	// Metoden avrunder desimaltall til 2 siffer etter komma
	public static double avrund2(double des) {
		return (int)(des*100 + 0.5)/100.0;
	}

	// Metoden avrunder desimaltall til et gitt antall siffer etter komma
	public static double avrund(double des, int ant) {
		double tiPot = Math.pow(10,ant);
		return (int)(des*tiPot + 0.5)/tiPot;
	}

	// Metoden skriver et antall tegn i sekvens
	public static String skrivTegn(char t, int ant) {
		String sekvens = "";
		for (int i=1; i<=ant; i++) {
			sekvens += t;
		}
		return sekvens;
	}

	// Metoden avgjør om et tegn er en (engelsk) bokstav
	public static boolean erBokstav(char tegn) {
		return	('a' <= tegn && tegn <= 'z' || 'A' <= tegn && tegn <= 'Z'); 
	}

	// Metoden leser et heltall i området (min - max)
	public static int lesHeltall (int min, int max, String Ledetekst){
	int tall = 0;
		do {
	String tallTekst = showInputDialog(Ledetekst + " ("+min+" - "+max+"):");
	tall = parseInt(Ledetekst);
	//hvis ulovlig, feilmelding!
	if (tall < min || max < tall)
		showMessageDialog(null, "Ulovlig verdi!");
	} while (tall < min || max < tall);
	return tall;
	}

 // Metode for å trekke et tilfeldig heltall i området min - max    
  private static int trekkTall(int min, int max) {
    return min + (int)( random()*(max-min+1) );
  }

  // Slutt på hjelpemetodene
}

}