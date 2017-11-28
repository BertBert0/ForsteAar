public class Tetris extends EasyGraphics {   // L14

  public static void main(String[] args) {
    launch(args);
  }

  public void run() {
makeWindow("Tetris", 500,500);


setBackground(188,188,188);
//legger steinene i rader
for(int rad=0; rad<3;rad++){

    //tegner steiner
    for (int nr=0; nr<4;nr++) {
    drawRectangle(50+nr*100, 400-rad*50, 100, 50);
    pause(500);
    }
}
  }
}