import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;


public class KalkulatorV1 {

  public static void main(String[] args) {
    // Innlesing
    String tallTekst = showInputDialog("Gi et heltall: ");
    // Konverterer fra String til heltall:
    int tall = parseInt(tallTekst);
    double tallDes = parseDouble(tallTekst);
// Innlesing
    tallTekst = showInputDialog("Gi et heltall til: ");
    // Konverterer fra String til heltall:
    int tall2 = parseInt(tallTekst);
    double tallDes2 = parseDouble(tallTekst);

    // Beregning
    int svarAdd = tall + tall2;   	// Sum, addisjon +
    int svarMult = tall * tall2;  	// Produkt
    int svarDiff = tall - tall2;	// Differans
    double svarBrok = tallDes / tallDes2;	// Brøk

    // Utskrift
    showMessageDialog(null, tall + " + " + tall2 + " = " + svarAdd  + "\n"
                           + tall + " * " + tall2 + " = " + svarMult + "\n"
    					   + tall + " - " + tall2 + " = " + svarDiff + "\n"
                           + tall + " / " + tall2 + " = " + svarBrok);
  }

}