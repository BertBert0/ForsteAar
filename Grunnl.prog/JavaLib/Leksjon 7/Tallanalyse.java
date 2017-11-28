import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;
import java.io.*;
import java.util.*;

public class Tallanalyse {

  public static void main(String[] args) throws Exception {
//Leser ikke inn filnavn
String filnavn = "desimal.txt";

// Åpne fil
File fil = new File(filnavn);
Scanner leser = new Scanner(fil);
leser.useLocale(Locale.US); 
PrintWriter skriver = new PrintWriter("heltall.txt");

// Overføre data, prosessere
int antall = 0;
while ( leser.hasNextDouble() ){
		// Ett og ett desimaltall
	int heltall = (int)Math.round(leser.nextDouble());
	skriver.print(heltall + "  ");
	antall++;
	if ( antall % 4 == 0 )
		skriver.println();
}


// Lukke fil
leser.close();
skriver.close();


//Skriver ut kvittering....
String utTekst = "Filbehandling ferdig, ok!";
showMessageDialog(null, utTekst);

  }

}