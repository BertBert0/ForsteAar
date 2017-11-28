import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;

public class Tekstligsifferswitch {

  public static void main(String[] args) {
 // Leser inn 
String tallTekst = showInputDialog("Gi et heltall: ");
//double tall = parseDouble(tallTekst);
int tall = parseInt(tallTekst);
int sisteTall = tall%10;
String sisteSiffer = "Onsdag";
switch(sisteTall) {
	case 1: sisteSiffer = "En"; break;
	case 2: sisteSiffer = "To"; break;
	case 3: sisteSiffer = "Tre"; break;
	case 4: sisteSiffer = "Fire"; break;
	case 5: sisteSiffer = "Fem"; break;
	case 6: sisteSiffer = "Seks"; break;
	case 7: sisteSiffer = "Syv"; break;
	case 8: sisteSiffer = "Åtte"; break;
	case 9: sisteSiffer = "Ni"; break;
	case 0: sisteSiffer = "Null";
}

String utTekst = "Siste siffer i " + tall + " er " + sisteTall + " -> " + sisteSiffer;
showMessageDialog(null, utTekst);
    // Skriv Java-setninger her
  }

}