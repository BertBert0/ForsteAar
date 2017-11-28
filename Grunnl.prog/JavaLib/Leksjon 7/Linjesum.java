import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;
import java.io.*;
import java.util.*;

public class Linjesum {

  public static void main(String[] args) throws Exception {
//Leser ikke inn filnavn
String filnavn = "heltall.txt";

// Åpne fil
File fil = new File(filnavn);
Scanner leser = new Scanner(fil);
leser.useLocale(Locale.US); 
PrintWriter skriver = new PrintWriter("linjesum.txt");

// Overføre data, prosessere
int sum = 0;
int antall = 0;
while ( leser.hasNextInt() ){
		// Ett og ett desimaltall
	int linjesum = leser.nextInt();
	sum += linjesum;
	antall++;
	if ( antall % 4 == 0 ){
	skriver.println(sum);
	sum = 0;
	}
	
}
if ( antall % 4 != 0)
		skriver.println(sum);


// Lukke fil
leser.close();
skriver.close();


//Skriver ut kvittering....
String utTekst = "Filbehandling ferdig, ok!";
showMessageDialog(null, utTekst);

  }

}