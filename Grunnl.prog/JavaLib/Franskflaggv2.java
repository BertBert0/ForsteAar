import static java.lang.Integer.*;	//Trenger parseInt

public class Franskflaggv2 extends EasyGraphics {   // L14

  public static void main(String[] args) {
    launch(args);
  }

  public void run() {
makeWindow("VIVA LA FRANCE!", 2000,1000);
// Brukerdialogen: Mindre, like stort eller større flagg? I prosent ... Les skalering som prosent.
int faktor = parseInt(getText ("Gi skaleringsfaktor: "+"%"));
double pf = (faktor/100.0);


setBackground(0, 0, 0);
setColor(0, 0, 255);
fillRectangle(50, 50, (int)(100*pf), (int)(200*pf));

setColor(255, 255, 255);
fillRectangle(50+(int)(100*pf), 50, (int)(100*pf), (int)(200*pf));

setColor(255, 0, 0);
fillRectangle(50+2*(int)(100*pf), 50, (int)(100*pf), (int)(200*pf));
setColor(155,155,155);
drawRectangle(50, 50, (int)(300*pf), (int)(200*pf));
  }
}