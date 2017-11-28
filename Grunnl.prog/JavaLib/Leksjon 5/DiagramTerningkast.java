import static java.lang.System.*;
import static java.lang.Integer.*;  //Trenger parseInt
import static java.lang.Double.*;   //Trenger parseDouble
import static javax.swing.JOptionPane.*;

public class DiagramTerningkast extends EasyGraphics {   // L14

  public static void main(String[] args) {
    launch(args);
  }




  public void run() {
makeWindow("Terningkast - Sum øyne", 600,600);
  

  String kastTekst = showInputDialog("Gi antall kast med to terninger");
int aKast = parseInt(kastTekst);

int[] antallAv = new int[13]; 
 
for (int i = 1; i<=aKast; i++) {
  int øyne1 = trekkTall(1,6);
  int øyne2 = trekkTall(1,6);

  int sumØyne = øyne1+øyne2;

  antallAv[sumØyne]++;


}
  setFont("Arial", 40);
  drawString("Kastresultat: Sum øyne", 75, 50);
  setFont("Arial",18);
  for (int i=2; i<=12;i++){
    drawString(i + ": ", 10, 45*i);
    fillRectangle(40, 45*i-20, antallAv[i]*10, 30);
  }
 /*for (int i=2; i<antallAv.length;i++){
  if (i<10){
  utTekst += "  " + i + ":  " + antallAv[i] + "\n"; 
  }
  else{
  utTekst += i + ":  " + antallAv[i] + "\n";
  }
}
*/



  }

    // Metode for å trekke et tilfeldig heltall i området min - max    
  private static int trekkTall(int min, int max) {
    return min + (int)( Math.random()*(max-min+1) );
  }
}