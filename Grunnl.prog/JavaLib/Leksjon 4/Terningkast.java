/* Leksjon 4: Testeksempel for metoder.
 * Kaster terning, og viser fram kastresultatet
 * som en terning!
 */
import static java.lang.Integer.*;



public class Terningkast extends EasyGraphics {   // L14

  public static void main(String[] args) {
    launch(args);
  }

  public void run() {
    int wX = 600, wY = 500;
makeWindow("Terningkast", wX,wY);
setFont("Arial", 30);
boolean ferdig;
int antallKast=0;

    int kast = parseInt(getText("Antall terningkast: "));
    int str = wX/10;
    for (int i=1; i<=kast; i++){
      int øyne = 1 + (int)(Math.random()*6);
      int xPos = 1 + (int)(Math.random()*(wX-str));
      int yPos = 1 + (int)(Math.random()*(wY-str));

        switch (øyne) {
          case 1: visEn(xPos,yPos,str); break;
          case 2: visTo(xPos,yPos,str); break;
          case 3: visTre(xPos,yPos,str); break;
          case 4: visFire(xPos,yPos,str); break;
          case 5: visFem(xPos,yPos,str); break;
          case 6: visSeks(xPos,yPos,str);
        }

      pause(500);
      }
    }

    // Egendefinerte metoder
    private void visEn(int x, int y, int s) {
      drawString("1", x,y);
      drawRectangle(x-2,y-2,s+4,s+4);
      fillCircle(x+s/2,y+s/2,s/6);
    }
    private void visTo(int x, int y, int s) {
      drawString("2", x,y);
      drawRectangle(x-2,y-2,s+4,s+4);
      fillCircle(x+s/6,y+s/6,s/6);
      fillCircle(x+5*s/6,y+5*s/6,s/6);
    }
    private void visTre(int x, int y, int s) {
      drawString("3", x,y);
      drawRectangle(x-2,y-2,s+4,s+4);
      fillCircle(x+s/6,y+s/6,s/6);
      fillCircle(x+s/2,y+s/2,s/6);
      fillCircle(x+5*s/6,y+5*s/6,s/6);
    }
    private void visFire(int x, int y, int s) {
      drawString("4", x,y);
      drawRectangle(x-2,y-2,s+4,s+4);

    }
    private void visFem(int x, int y, int s) {
      drawString("5", x,y);
      drawRectangle(x-2,y-2,s+4,s+4);
      fillCircle(x+s/6,y+s/6,s/6);          //  *
      fillCircle(x+5*s,y+s/6,s/6);          //      *
      fillCircle(x+s/2,y+s/2,s/6);          //    *
      fillCircle(x+s/6,y+5*s,s/6);          //  *
      fillCircle(x+5*s/6,y+5*s/6,s/6);      //      *
    }
    private void visSeks(int x, int y, int s) {
      drawString("6", x,y);
      drawRectangle(x-2,y-2,s+4,s+4);
    }
}