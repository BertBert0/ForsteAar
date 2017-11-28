import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;
import java.io.*;
import java.util.*;

public class Oppgave1f {

public static String antall(int tab[], String søkeTall) {
int antall;
int tall = parseInt(søkeTall);
for (int i=1; i<=søkeTall.length(); i++){
if (tab[i] > tall);
antall++;
}
return antall;
}
}
