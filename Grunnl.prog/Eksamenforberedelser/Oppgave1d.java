import static java.lang.System.*;
import static java.lang.Integer.*;	//Trenger parseInt
import static java.lang.Double.*; 	//Trenger parseDouble
import static javax.swing.JOptionPane.*;
import java.io.*;
import java.util.*;

public class Oppgave1d {
public static void main(String[] args) {
String helTall = showInputDialog("Gi et Heltall:");

int antSiffer = String.valueOf(helTall).length();




out.println(antSiffer);
}
}