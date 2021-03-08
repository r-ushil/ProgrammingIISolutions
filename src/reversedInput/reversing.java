package reversedInput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class reversing {


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    Deque<String> lines = new ArrayDeque<>();
    while (line != null) {
      lines.push(line);
      line = br.readLine();
    }
    while (!lines.isEmpty()) {
      System.out.println(lines.pop());
    }
  }

}
