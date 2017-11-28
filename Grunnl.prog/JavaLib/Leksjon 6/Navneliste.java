import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;
import java.io.*;

public class Navneliste {

  public static void main(String[] args) throws Exception {
// Lager ei navneliste
  	String[] navn = {"Ole Olsen", "Ida Nilsen", "Ola Normann", "Medel Swenson", "Anne By" };

    // Skriver navn til fil.
    //PrintWriter skriver = new PrintWriter("navn.txt");
    // Alt:
    String filnavn = "navn.txt";
    PrintWriter skriver = new PrintWriter(filnavn);
for (int i=0; i<navn.length; i++){
	skriver.println(navn[i]);
	}


    // Lukker skriver
    skriver.close();

    //String utTekst = "";
    //showMessagedialog(null, utTekst);
  }

}