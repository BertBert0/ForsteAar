import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;

public class Terningkast {

  public static void main(String[] args) {
 // Leser inn


    // Skriv Java-setninger her
  }

    // Metode for å trekke et tilfeldig heltall i området min - max    
  private static int trekkTall(int min, int max) {
    return min + (int)( Math.random()*(max-min+1) );
  }

}