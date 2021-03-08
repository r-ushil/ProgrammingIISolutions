package oneFourTwo;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    int x = Integer.parseInt(args[0]);
    List<Integer> results = new ArrayList<>();
    results.add(x);
    while (x > 1) {
      x = handlesNumbers.next(x);
      results.add(x);
    }
    System.out.println(results);
  }
}
