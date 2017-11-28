import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;

public class Sifferantall {

  public static void main(String[] args) {
 // Leser inn 
String tallTekst = showInputDialog("Gi et tall: ");
//double tall = parseDouble(tallTekst);
int tall = parseInt(tallTekst);
if (tall <100 && tall >-100) showMessageDialog(null, tall + " har mindre enn 3 siffer");
	else showMessageDialog(null, tall + " har fler enn 3 siffer");

    // Skriv Java-setninger her
  }

}