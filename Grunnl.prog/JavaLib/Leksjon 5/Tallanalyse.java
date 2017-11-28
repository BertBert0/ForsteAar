import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;



public class Tallanalyse {

  public static void main(String[] args) {

String aTekstTall = showInputDialog("Gi et antall tall!");
int aTall = parseInt(aTekstTall);

int[] tall = new int[aTall];

for(int i = 0; i<tall.length; i++){

	tall[i] = trekkTall(1,10);
}


 //int[] tall = {10, 1, 10, 3, 9, 8, 10, 6, 2, 1}; 


 String tallTekst = "Tallene er: ";
for(int i = 0; i<tall.length; i++){

	tallTekst+=(tall[i] + "  ");
}
 out.println(tallTekst);


int sum=0;
for(int i = 0; i<tall.length; i++){

	sum += tall[i];
}
	int snitt = sum/tall.length;
out.println("Snittet er: " + snitt);

boolean boo = false;
int pos = 0;
while (!boo && pos < tall.length)
if (tall[pos] == snitt)
	boo = true;
else pos++;
String svar ="";
if (boo == true)
	svar ="Ja.";
	else
		svar = "Nei.";

/*for(int i = 0; i<tall.length; i++){

	if (tall[i] == snitt)
		boo = true;
		continue;
}*/

out.println("Snittet er en verdi i tallsettet: " + svar);


 String små = "Tall mindre enn 6: " ;
for(int i = 0; i<tall.length; i++){
if (tall[i]<6)
	små+=(tall[i] + "  ");
}
 out.println(små);



    // Skriv Java-setninger her
  }

  // Metode for å trekke et tilfeldig heltall i området min - max    
  private static int trekkTall(int min, int max) {
    return min + (int)( Math.random()*(max-min+1) );
  }

}