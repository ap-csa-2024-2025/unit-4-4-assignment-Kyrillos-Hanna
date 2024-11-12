import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Input String:" );
    String sentence = sc.nextLine();
    sentence = sentence.toLowerCase();
    int times = 0;
    String newString = "";

    for (int i = 0; i <= sentence.length() - 1; i++) {
      if (sentence.substring(i, i + 1).equals("p")) {
        if (sentence.substring(i + 1, i + 2).equals("a") || sentence.substring(i + 1, i + 2).equals("e") || sentence.substring(i + 1, i + 2).equals("i") || sentence.substring(i + 1, i + 2).equals("o") || sentence.substring(i + 1, i + 2).equals("u")) {
          times += 1;
        }
      }
    }
    System.out.println(times);

    for (int i = 0; i <= sentence.length() - 1; i++) {
      if (!(sentence.substring(i, i + 1).equals("e") || sentence.substring(i, i + 1).equals("t") || sentence.substring(i, i + 1).equals("a") || sentence.substring(i, i + 1).equals("i") || sentence.substring(i, i + 1).equals("o"))) {
        newString = newString + sentence.substring(i, i + 1);
      } 
    }
    System.out.println(newString);
  }
}
