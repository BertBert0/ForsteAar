import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;

public class OddePartall {

  public static void main(String[] args) {
 // Leser inn 
String nedreTekst = showInputDialog("Gi nedre grense for et område med positive heltall: ");
String ovreTekst = showInputDialog("Gi øvre grense for et område med positive heltall: ");
//double tall = parseDouble(tallTekst);
int nedreTall = parseInt(nedreTekst);
int ovreTall = parseInt(ovreTekst);
String linje1 = "", linje2 = "";
for (int tall = nedreTall; tall <= ovreTall; tall++)
	if (tall%2 == 1)
		linje1 += tall + ",  ";
	else
		linje2  += tall + ",  ";
 

String utTekst =   "Nedre grense: " + nedreTall + "\n"
				 + "Øvre Grense: " + ovreTall + "\n"
				 + "Oddetall: " + linje1 + "\n"
				 + "Partall: " + linje2;
showMessageDialog(null, utTekst);
    // Skriv Java-setninger her
  }

}