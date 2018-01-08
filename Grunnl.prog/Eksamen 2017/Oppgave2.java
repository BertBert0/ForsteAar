import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;
public class Oppgave2{
public static void main(String[]args){
int ant;
String utskrift = "";
char bokstav;
do{
ant = parseInt(showInputDialog("Gi antall bokstaver (1-12):"));
if(ant < 1 || ant > 12)
showMessageDialog(null, "Ulovlig antall bokstaver!");
} while (ant < 1 || ant > 12);
int tableAnt = ant-1;
char[] bokstaver = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'};

for( int bokNr = 0; bokNr <= tableAnt; bokNr++){
	int i = 0;
	do {
		i = trekkTall(0,11);
	} while ( bokstaver[i] == '*');



utskrift += bokstaver[i] + " ";
bokstaver[i] = '*';
}
System.out.println(utskrift);
}
 private static int trekkTall(int min, int max) {
    return min + (int)( random()*(max-min+1) );
  }
}