import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;

public class Tekstligsifferif {

  public static void main(String[] args) {
 // Leser inn 
String tallTekst = showInputDialog("Gi et heltall: ");
//double tall = parseDouble(tallTekst);
int tall = parseInt(tallTekst);
int sisteTall = tall%10;
String sisteSiffer = "Onsdag";
	 if (sisteTall == 1) sisteSiffer = "En";
else if (sisteTall == 2) sisteSiffer = "To";
else if (sisteTall == 3) sisteSiffer = "Tre";
else if (sisteTall == 4) sisteSiffer = "Fire";
else if (sisteTall == 5) sisteSiffer = "Fem";
else if (sisteTall == 6) sisteSiffer = "Seks";
else if (sisteTall == 7) sisteSiffer = "Syv";
else if (sisteTall == 8) sisteSiffer = "Åtte";
else if (sisteTall == 9) sisteSiffer = "Ni";
else if (sisteTall == 0) sisteSiffer = "Null";

String utTekst = "Siste siffer i " + tall + " er " + sisteTall + " -> " + sisteSiffer;
showMessageDialog(null, utTekst);
    // Skriv Java-setninger her
  }

}