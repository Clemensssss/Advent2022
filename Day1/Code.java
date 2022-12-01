import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code {
  public static void maxCalories() {
    try {
      File f = new File ("input.txt");
      Scanner input = new Scanner(f);
      int currentCalorie = 0;
      int highestCalorie = 0;
      int secondHighestCalorie = 0;
      int thirdHighestCalorie = 0;
      while (input.hasNextLine()) {
        String line = input.nextLine();
        if (line.equals("")) {
          if (currentCalorie > highestCalorie) {
            highestCalorie = currentCalorie;
          }
          else if (currentCalorie > secondHighestCalorie) {
            secondHighestCalorie = currentCalorie;
          }
          else if (currentCalorie > thirdHighestCalorie) {
            thirdHighestCalorie = currentCalorie;
          }
          currentCalorie = 0;
        }
        else {
          currentCalorie += Integer.parseInt(line);
        }
      }
      System.out.println(highestCalorie + secondHighestCalorie + thirdHighestCalorie);
    }
    catch (FileNotFoundException e) {

    }
  }
}
