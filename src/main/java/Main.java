

public class Main {
  
  public static void main(String[] args) {

    HighHat h = new HighHat(250);
    Drum d = new Drum(275);
    Guitar g = new Guitar(225);
    h.start();
    d.start();
    g.start();
    try { Thread.sleep(4000);}
    catch (Exception e) {}
    g.setTime(20);
    try { Thread.sleep(4000);}
    catch (Exception e) {}
    g.setTime(1000);
    
  }

}