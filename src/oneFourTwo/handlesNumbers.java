package oneFourTwo;

public class handlesNumbers {

  public static int next(int x) {
    switch (x % 2) {
      case 0:
        return (x/2);
      default:
        return (3 * x + 1);
    }
  }

}
