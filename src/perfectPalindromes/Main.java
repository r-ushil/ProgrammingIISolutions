package perfectPalindromes;

public class Main {

  private static boolean checkPalindrome(int cubed) {
    String cubedString = String.valueOf(cubed);
    String first = cubedString.substring(0,cubedString.length() / 2);
    String second;
    if (cubedString.length() % 2 == 0){
      second = new StringBuilder(cubedString
        .substring(cubedString.length()))
        .reverse()
        .toString();
    } else {
      second = new StringBuilder(cubedString
        .substring(cubedString.length() / 2 + 1))
        .reverse()
        .toString();
    }
    return first.equals(second);
  }

  public static void main(String[] args) {
    int bound = Integer.parseInt(args[0]);
    for (int i = 0; i < bound; i++) {
      int cubed = i * i * i;
      if (checkPalindrome(cubed)) {
        System.out.println(i + " cubed is " + cubed);
      }
    }
  }

}
