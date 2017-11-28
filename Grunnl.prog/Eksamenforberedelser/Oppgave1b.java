

public class Oppgave1b extends EasyGraphics {   // L14

  public static void main(String[] args) {
    launch(args);
  }

  public void run() {
makeWindow("Tetris", 500,500);


int x = 50, y = 50;
int f = 100;
drawRectangle(x, y, 2*f, 2*f);
drawCircle(x, y, f/2);
drawRectangle(x+f, y, f, f);
drawRectangle(x, y+f, f, f);
drawCircle(x+f, y+f, f);
}
}