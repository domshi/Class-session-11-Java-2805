public class HighHat extends Thread {
  private int time;
  public HighHat (int t) {time = t;}
  public void run() {
    while (true) {
      try {
        Thread.sleep(time);
        System.out.println(" tssst ");

      }
        catch (InterruptedException e) {
          System.out.println("oops");
        }
    }
  }
}