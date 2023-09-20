package kashish.com.practice.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIterate {

    
    static List<String> lineNumbering(List<String> lines) {
      List<String> updatedLines = new ArrayList<>();
      int counter = 1;
      for(String line : lines){

        updatedLines.add(("" + counter) + " " + line);
        counter++;
      }
      return updatedLines;
    }

    public static void main(String args[]) {

      assert (lineNumbering(Arrays.asList("Hi", "Hello", "Hey")).equals(Arrays.asList("1 Hi", "2 Hello", "3 Hey"))) : "Expect [\"1 Hi\", \"2 Hello\", \"3 Hey\"] for lines = [\"Hi\", \"Hello\", \"Hey\"]";
      System.out.println("All test cases in main function passed");

    }
    
}
