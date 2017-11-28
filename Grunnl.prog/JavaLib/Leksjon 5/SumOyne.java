import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;

public class SumOyne  {

  public static void main(String[] args) {
 // Leser inn
String kastTekst = showInputDialog("Gi antall kast med to terninger");
int aKast = parseInt(kastTekst);

int[] antallAv = new int[13]; 
 
for (int i = 1; i<=aKast; i++) {
	int øyne1 = trekkTall(1,6);
	int øyne2 = trekkTall(1,6);

	int sumØyne = øyne1+øyne2;

	antallAv[sumØyne]++;
}
String utTekst = "Kastresultat: " + "\n";
for (int i=2; i<antallAv.length;i++){
	if (i<10){
	utTekst += "  " + i + ":  " + antallAv[i] + "\n";	
	}
	else{
	utTekst += i + ":  " + antallAv[i] + "\n";
	}
}
showMessageDialog(null, utTekst);




    // Skriv Java-setninger her
  }

    // Metode for å trekke et tilfeldig heltall i området min - max    
  private static int trekkTall(int min, int max) {
    return min + (int)( Math.random()*(max-min+1) );
  }


}