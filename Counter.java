public class Counter {
  private int count;
  private static int instanceCount;

  public Counter () {
    this(4, "Created the constructor!");
    instanceCount ++;
  }
  public Counter (int initial) {
    count = initial;
    instanceCount++;
  }
  public Counter (int initial, String message) {
    count = initial;
    System.out.println(message);
  }
  public int getCount () {
    return count;
  }
  public void increment() {
    count ++;
  }
  public void increment(int delta) {
    count += delta;
  }
  public void reset() {
    count = 0;
  }
  public static int getInstances() {
    return instanceCount;
  }
}
