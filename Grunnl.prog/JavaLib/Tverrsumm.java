import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;

public class Tverrsumm {

  public static void main(String[] args) {
 // Leser inn 
String tallTekst = showInputDialog("Gi et heltall mellom 0 og 1000: ");
int tall = parseInt(tallTekst);
int tverrSum1 = tall/1000;
int tverrSum2 = tall%1000/100;
int tverrSum3 = tall%100/10;
int tverrSum4 = tall%10;

 int tverrSvar = tverrSum1 + tverrSum2 + tverrSum3 + tverrSum4;
if (tverrSum1 >0)	showMessageDialog(null, tverrSum1 + " + " + tverrSum2 + " + " + tverrSum3 + " + " + tverrSum4 + " = " + tverrSvar);
	else showMessageDialog(null, tverrSum2 + " + " + tverrSum3 + " + " + tverrSum4 + " = " + tverrSvar);


    // Skriv Java-setninger her
  }

}