/* 
 *  Programmet fyller en sirkel som har radius 200 med 
 *  standardfargen i et grafikkvindu av størrelse 800*800.
 *
 *  Bruk gjerne dette programmet som en mal.
 *  
 *  Linje 14: Bytt ut klassenavnet DemoSirkel,
 *            og endre filnavnet tilsvarende.
 *  Linje 21: Bytt ut tittelen "Sirkel",
 *            og endre evt. størrelsen på vinduet.
 *  Linje 23: Bytt ut kallet på fillCircle med egen kode.
 */
 
public class DemoSirkel extends EasyGraphics {   // L14

  public static void main(String[] args) {
    launch(args);
  }

  public void run() {
    makeWindow("SirkelJerk, you spin me right round baby right round!", 800, 800);              // L21
    
    fillCircle(400, 400, 200);                   // L23
  }
}