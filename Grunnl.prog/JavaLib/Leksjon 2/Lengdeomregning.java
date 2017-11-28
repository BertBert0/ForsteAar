import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;

public class Lengdeomregning {

  public static void main(String[] args) {
  	// deklarer konstant for tommer
  final double tommeKalk = 2.54/100;
 // Leser inn lengde i tommer
String tommerTekst = showInputDialog("Gi en lengde i tommer: ");
double tommer = parseDouble(tommerTekst);
//Regner om fra tommer til meter
double meter = tommer*tommeKalk;
//
String utTekst = "Lengde i Tommer: " + tommer + "\n"
			   + "Lengde i Meter: " + meter + "\n";
	showMessageDialog(null, utTekst);
  }

}