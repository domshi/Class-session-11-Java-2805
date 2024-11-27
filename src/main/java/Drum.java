public class Drum extends Thread {
  private int time;
  public Drum (int t) {time = t;}
  public void run() {
    while (true) {
      try {
      Thread.sleep(time);
      System.out.println(" beat ");
        
    }
      catch (InterruptedException e) {
        System.out.println("oops");
      }
  }
}}