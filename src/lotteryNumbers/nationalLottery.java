package lotteryNumbers;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class nationalLottery {

  static Set<Integer> numbers = new HashSet<>();

  private static void createSet() {
    for (int i = 1; i < 50; i++) {
      numbers.add(i);
    }
  }

  private static int chooseValidNum(Random rand) {
    while (true) {
      int num = rand.nextInt(50);
      if (numbers.contains(num)) {
        return num;
      }
    }
  }

  public static void main(String[] args) {
    createSet();
    Random rand = new Random();
    int count = 1;
    while (count < 7) {
      int num = chooseValidNum(rand);
      System.out.println("Number " + count + ": " + num);
      count += 1;
    }
    int num = chooseValidNum(rand);
    System.out.println("Bonus Number: " + num);
  }
}
