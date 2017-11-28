import static java.lang.System.*;
import static javax.swing.JOptionPane.*;

public class ShowDialogRandom {

  public static void main(String[] args) {
    // Skriv Java-setninger her
if (Math.random() <0.2) 		showMessageDialog (null, "Hei Verden");
else if (Math.random() <0.4) 	showMessageDialog (null, "Gi meg, gi meg en BAYER!");
else if (Math.random() <0.8) 	showMessageDialog (null, "Ugg blæ");
else if (Math.random() <1) 		showMessageDialog (null, "Funkær detta?");
    
  }

}