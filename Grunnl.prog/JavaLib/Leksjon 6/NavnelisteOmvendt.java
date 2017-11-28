import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;
import java.io.*;
import java.util.*;

public class NavnelisteOmvendt {

  public static void main(String[] args) throws Exception {

      //Lager stor nok tabell
  	//String[] navn = new String[100];

  String filnavn = "navn.txt";
    File fil = new File(filnavn);
    // Skal ha eksakt rett størelse på tabellen
     Scanner leser = new Scanner(fil);
     int antallNavn = 0; //Teller antall linjer -> antall navn
     while (leser.hasNextLine()){
      String linje= leser.nextLine();
      antallNavn++;
     }
     leser.close();
    String[] navn = new String[antallNavn];

  

    //Scanner 
   
    // Leser inn navn
    leser = new Scanner(fil);

    // Fra fil til tabell
    int i=0;
        while (leser.hasNextLine()) {
    	navn[i] = leser.nextLine();
        i++;
    }

    int antNavn = i;
    // Lukker leser
    leser.close();

    PrintWriter skriver = new PrintWriter("Omvendt" + filnavn);
    for(int j=antNavn-1; j>=0; j--){
      skriver.println(navn[j]);
    }
    skriver.close();
  
    String navnTekst = showInputDialog("Gi et navn");
      FileWriter skrivekobling = new FileWriter(filnavn, true);
      skriver = new PrintWriter(skrivekobling);
      skriver.println(navnTekst);

       skriver.close();






    //String utTekst = "";
    //showMessagedialog(null, utTekst);
  }

}