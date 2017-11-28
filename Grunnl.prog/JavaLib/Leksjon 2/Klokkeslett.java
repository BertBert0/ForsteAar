import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;

public class Klokkeslett {

  public static void main(String[] args) {
 // Leser inn 
String klokkeTekst = showInputDialog("Gi time: ");
int time = parseInt(klokkeTekst);

klokkeTekst = showInputDialog("Gi minutt: ");
int minutt = parseInt(klokkeTekst);

klokkeTekst = showInputDialog("Gi sekund: ");
int sekund = parseInt(klokkeTekst);

int midnatt = time*60*60 + minutt*60 + sekund;
showMessageDialog(null, "Klokken er: " + time + ":" + minutt + ":" + sekund + "\n"
						+ "Det er: " + midnatt + " sekunder siden midnatt");



    // Skriv Java-setninger her
  }

}