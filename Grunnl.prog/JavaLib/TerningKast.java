import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;

public class TerningKast {

  public static void main(String[] args) {
String utTekst = "Terningkast: ";
boolean ferdig;
int antallKast = 0;

//kaster terning, teller antall kast, ferdig?
  	do {
  	// Trekk tall
  	int tall = (int)(Math.random()*6+1);
  	utTekst += tall + " ";
  	// tell antall kast
	antallKast++;

  	// Ferdig?
  	ferdig = (tall == 6);


  	} while(!ferdig);
utTekst += "\n" + "Antall kast til første 6er: " + antallKast;

showMessageDialog(null, utTekst);


  }

}