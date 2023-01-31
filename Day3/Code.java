import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code {
  public static void Prioritizer() {
    try {
      File f = new File ("input.txt");
      Scanner input = new Scanner(f);
      int sum = 0;
      String firstHalf = 0;
      String secondHalf = 0;
      while (input.hasNextLine()) {
        String line = input.nextLine();
        firstHalf = line.substring(0,line.length()/2);
        secondHalf = line.substring(line.length()/2,line.length());
        for (int i = 0; i < firstHalf.length(); i++) {
          for (int j = 0; j < secondHalf.length(); j++) {
            
          }
        }
      }
    }
    catch (FileNotFoundException e) {

    }
  }
}
