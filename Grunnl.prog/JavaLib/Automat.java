/* Leksjon, jobb:
*/
import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;

public class Automat {

  public static void main(String[] args) {
  	
String oppgittBeløp = showInputDialog("Gi et beløp: ");
int beløpHel = parseInt(oppgittBeløp);

int seddel1000 	= beløpHel/1000;
int seddel500 	= beløpHel%1000/500;
int seddel200 	= (beløpHel - (seddel1000*1000) - (seddel500*500))/200;
int seddel100 	= (beløpHel - (seddel1000*1000) - (seddel500*500) - (seddel200*200))/100;
int seddel50 	= (beløpHel - (seddel1000*1000) - (seddel500*500) - (seddel200*200) - (seddel100*100))/50;
int mynt20	 	= (beløpHel - (seddel1000*1000) - (seddel500*500) - (seddel200*200) - (seddel100*100) - (seddel50*50))/20;	
int	mynt10 		= (beløpHel - (seddel1000*1000) - (seddel500*500) - (seddel200*200) - (seddel100*100) - (seddel50*50) - (mynt20*20))/10;
int	mynt5 		= (beløpHel - (seddel1000*1000) - (seddel500*500) - (seddel200*200) - (seddel100*100) - (seddel50*50) - (mynt20*20) - (mynt10*10))/5;
int	mynt1 		= (beløpHel - (seddel1000*1000) - (seddel500*500) - (seddel200*200) - (seddel100*100) - (seddel50*50) - (mynt20*20) - (mynt10*10) - (mynt5*5));


showMessageDialog(null, "Beløp: " + beløpHel + "kr" + "\n"
						+ "Utbetales med: "	+	"\n"
						+ "1000kr: " + seddel1000 + "\n"
						+ "500kr: " + seddel500 + "\n"
						+ "200kr: " + seddel200 + "\n"
						+ "100kr: " + seddel100 + "\n"
						+ "50kr: " + seddel50 + "\n"
						+ "20kr: " + mynt20 + "\n"
						+ "10kr: " + mynt10 + "\n"
						+ "5kr: " + mynt5 + "\n"
						+ "1kr: " + mynt1 + "\n");


  }

}