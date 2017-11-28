import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;

public class TerningKastGjennomsnitt {

  public static void main(String[] args) {
String utTekst = "Antall kasteserier: ";
boolean ferdig;
int antallKast = 0;
String tallTekst = showInputDialog("Gi antall kastserier: ");
int kastSerie = parseInt(tallTekst);

//kaster terning, teller antall kast, ferdig?
  	for (int i=0; i!=kastSerie; i++) {
  		do {
  		// Trekk tall
  		int tall = (int)(Math.random()*6+1);
  		// tell antall kast
		antallKast++;

 	 	// Ferdig?
 	 	ferdig = (tall == 6);


 	 	} while(!ferdig);

  }
  	double snitt = (double)antallKast/kastSerie;
  	double snittRound = (double)Math.round(snitt * 10000) / 10000;

utTekst += kastSerie + "\n" + "Gjennomsnittlig antall kast til første 6er: " + snitt + "\n" 
							+ "Rundet antall kast til første 6er: " + snittRound ;

showMessageDialog(null, utTekst);


  }

}