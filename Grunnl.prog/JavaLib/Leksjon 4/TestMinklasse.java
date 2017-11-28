// Leksjon 4, jobb 4, test av MineMetoder

import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;

public class TestMinklasse {

  public static void main(String[] args) {
 String tallTekst = showInputDialog("Gi et desimaltall: ");
 double tall = parseDouble(tallTekst);

double desTall1 = MineMetoder.avrund1(tall);
double desTall2 = MineMetoder.avrund2(tall);
int n = 4;
double desTall = MineMetoder.avrund(tall, n);

char x = 'X';
 String utTekst = tall + " avrundet til " + desTall1 + "\n"
 				+ MineMetoder.skrivTegn('-',50) + "\n"
 				+ tall + " avrundet til " + desTall2 + "\n"
 				+ MineMetoder.skrivTegn('=',30) + "\n"
 				+ tall + " avrundet til " + desTall + "\n"
 				+ MineMetoder.skrivTegn('*',30) + "\n"
 				+ "Bokstav? " + x + " " + " = " + MineMetoder.erBokstav(x);
 showMessageDialog(null, utTekst);
  }

}