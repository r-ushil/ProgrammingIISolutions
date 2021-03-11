package steamsAndDowncasting;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example {

  static Stream<Integer> restrictToPositiveIntegers(Stream<? extends Number> numbers) {
    return numbers.filter(i -> (i instanceof Integer))
      .map(i -> (Integer) i)
      .filter(i -> i > 0);
  }

  public static void main(String[] args) {
    List<Number> numbers = new ArrayList<>();
    int w = 1; float x = 2.0f; double y = 3.0; short z = 4_0;
    numbers.add(w); numbers.add(x); numbers.add(y); numbers.add(z);
    restrictToPositiveIntegers(numbers.stream());
  }

}
