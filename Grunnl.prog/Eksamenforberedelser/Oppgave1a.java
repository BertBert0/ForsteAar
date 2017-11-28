public class Oppgave1a {
public static void main(String[] args) {
int t = 373;
String u = t + ": ";
if ( t%10 == t/100 )
u += "s";
else
u += "u";
System.out.println(u);
}
}