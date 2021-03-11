package streamReducation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

  private static <S> List<S> addAll(List<S> first, List<S> second) {
    for (S s : second) {
      first.add(s);
    }
    return first;
  }

  static List<Integer> concatenate(List<List<Integer>> lists) {
    List<Integer> empty = new ArrayList<>();
    return lists.stream().reduce(empty, Example::addAll);
  }

  static int findMin(List<Integer> numbers) {
    return numbers.stream().reduce(Integer.MAX_VALUE, Example::min);
  }

  static int findMinOrZero(List<Integer> numbers) {
    return numbers.stream().reduce(Example::min).orElse(0);
  }

  static int min(Integer x, Integer y) {
    return x < y ? x : y;
  }

  static int findMax(List<Integer> numbers) {
    return numbers.stream().reduce(Integer.MIN_VALUE, (res, curr) -> curr > res ? curr : res);
  }

  static int findMaxOrElse(List<Integer> numbers) {
    return numbers.stream().reduce((res, curr) -> curr > res ? curr : res).orElse(0);
  }

  static int findMinOfMaxes(List<List> listOfLists) {
    List<Integer> empty = new ArrayList<>();
    return findMin(listOfLists.stream().map(Example::findMax).collect(Collectors.toList()));
  }
}
