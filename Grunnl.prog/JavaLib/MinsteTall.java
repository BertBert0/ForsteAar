import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;
import static java.lang.Math.*;

public class MinsteTall {

  public static void main(String[] args) {
 // Leser inn 
String tallTekst = showInputDialog("Gi et tall: ");
int tall1 = parseInt(tallTekst);
tallTekst = showInputDialog("Gi et tall til: ");
int tall2 = parseInt(tallTekst);
tallTekst = showInputDialog("Gi enda et tall: ");
int tall3 = parseInt(tallTekst);
tallTekst = showInputDialog("Og gi et tall til er du snill: ");
int tall4 = parseInt(tallTekst);
int minst1 = Math.min (tall1, tall2);
int minst2 = Math.min (tall3, tall4);
int minstFinal = Math.min (minst1, minst2);
showMessageDialog(null, "Av de oppgitte tallene: " + tall1 + ", " + tall2 + ", " + tall3 + ", " + tall4 + "." + "\n"
							+ " Er den minste verdien: " + minstFinal);

  }

}