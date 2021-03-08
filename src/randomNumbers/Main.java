package randomNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Random rand = new Random();
    int bound = Integer.parseInt(args[0]);
    assert bound > 0;
    Boolean[] validation = new Boolean[bound];
    //no nice way to stream primitive bools, so fill w false
    Arrays.fill(validation, false);
    List<Integer> output = new ArrayList<>();
    //anyMatch uses lambda
    while (Arrays.stream(validation).anyMatch(value -> value != true)) {
      int toPrint = rand.nextInt(bound);
      validation[toPrint] = true;
      output.add(toPrint);
    }
    System.out.println(output);
  }
}
