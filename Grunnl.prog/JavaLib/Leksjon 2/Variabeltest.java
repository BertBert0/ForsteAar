// Leksjon 2: Jobb 1
// Test av variabler, inndata og utskrift.

//Bibliotekressurser
import static java.lang.System.*;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Variabeltest {

  public static void main(String[] args) {
 	// Deklarerer variabler til to navn
 	String fornavn, etternavn;
 	// Initier variabel med standardtekst
 	String melding = "Lykke til med Java";
 	// Deklarerer heltallsvariabel
 	int årstall;
 	// Les inn fornavn og etternavn fra brukeren
 	fornavn = showInputDialog("Skriv inn fornavn");
 	etternavn = showInputDialog("Skriv inn etternavn");
 	// Les inn heltall: årstall fra brukeren
 	String årTekst = showInputDialog("Skriv inn årstall");
 	årstall = parseInt(årTekst);
 	// Skriver ut informasjon
 	showMessageDialog(null, "Fornavn: " + fornavn + "\n"
 							+ "Etternavn: " + etternavn +"\n"
 							+ "Årstall: " + årstall + "\n"
 							+ melding);
 

  }

}