import static java.lang.System.*;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Kalkulator {

  public static void main(String[] args) {
// Leser inn tallet fra brukeren
  	String tallTekst = showInputDialog("Gi et heltall: ");
// Initierer variabel for tall
  	int tall = parseInt(tallTekst);
// Hjelpevariabel til regnesvar
  	int svarAdd = tall + tall; 
  	int svarMult = tall * tall;
// Skriver ut informasjon
  	showMessageDialog(null, "Sum: " + tall + " + " + tall + " = " + svarAdd + "\n"
  					+ "Produkt: " + tall + " * " + tall + " = " + svarMult);
  																			

  }
}