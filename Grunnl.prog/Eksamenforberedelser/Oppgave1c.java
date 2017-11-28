import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;
import java.io.*;
import java.util.*;

public class Oppgave1c {
public static void main(String[] args) {
int spesTall = 1248;

int x= spesTall%10*10;
int y= (spesTall/10)%10;
spesTall = (spesTall/100)*100+x+y;

/*int sisteTall;
int nestSisteTall;

sisteTall = spesTall%10*10;
nestSisteTall = spesTall/10;
nestSisteTall = nestSisteTall%10;
spesTall = spesTall/100;
spesTall = spesTall*100+nestSisteTall+sisteTall;
*/


out.println(spesTall);
}
}