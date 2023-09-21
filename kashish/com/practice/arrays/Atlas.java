package kashish.com.practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Atlas {

    //good Question..
      public static List<String> atlas(List<String> words) {

      
        List list = new ArrayList<>();
        String prev = words.isEmpty() || words.get(0).isEmpty() ? "" : "" + words.get(0).charAt(0);
        for (String w : words)
            if (!w.isEmpty() && prev.endsWith("" + w.charAt(0)))
                list.add(prev = w);
            else
                break;
        return list;
    
      }
        public static void main(String args[]) {
        ArrayList<String> words = new ArrayList<String>(
                Arrays.asList("max", "xmy", "ytte", "de"));
        ArrayList<String> expected = new ArrayList<String>(
                Arrays.asList("max", "xmy", "ytte"));
        System.out.println(atlas(words).equals(expected));
        // assert atlas(words).equals(expected) : "Expect [\"budapest\", \"texas\", \"seattle\", \"edinburgh\", \"hokkaido\"] for list = [\"budapest\", \"texas\", \"seattle\", \"edinburgh\", \"hokkaido\"]" + atlas(words).toString();
        // System.out.println("All test cases in main function passed");
    }
    
}
