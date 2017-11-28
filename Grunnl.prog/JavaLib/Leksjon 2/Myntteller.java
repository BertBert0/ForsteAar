/* Leksjon, jobb:
*/
import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;

public class Myntteller {

  public static void main(String[] args) {
 // Leser inn 
String myntTekst = showInputDialog("Gi antall 20-kr: ");
int mynt20 = parseInt(myntTekst);
myntTekst = showInputDialog ("Gi antall 10-kr: ");
int mynt10 = parseInt(myntTekst);
myntTekst = showInputDialog ("Gi antall 5-kr: ");
int mynt5 = parseInt(myntTekst);
myntTekst = showInputDialog ("Gi antall 1-kr: ");
int mynt1 = parseInt(myntTekst);

int beløp = mynt20*20 + mynt10*10 + mynt5*5 + mynt1;
showMessageDialog(null, "Mynter: " + "\n"
						+ "20kr: " + mynt20 + "\n"
						+ "10kr: " + mynt10 + "\n"
						+ "5kr: " + mynt5 + "\n"
						+ "1kr: " + mynt1 + "\n"
						+ "Beløp: " + beløp + "kr");

  }

}