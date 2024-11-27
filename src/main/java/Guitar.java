public class Guitar extends Thread {
  private int time;
  public Guitar (int t) {time = t;}
  public void setTime(int t) {time = t;}
  public void run() {
    while (true) {
      try {
        Thread.sleep(time);
        System.out.println(" twang ");

      }
        catch (InterruptedException e) {
          System.out.println("oops");
        }
    }
  }
}