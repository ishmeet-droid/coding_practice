package kashish.com.practice.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMutableOp {
    public static void changePassword(ArrayList<String> list) {

    list.add(list.remove(0));
    
    }
    
    public static List<Integer> updateMarks(List<Integer> list, int rollNo, int marks) {
        list.set(rollNo, marks);
        return list;
    }

    public static void main(String args[]) {
      ArrayList<String> inputList = new ArrayList<String> (Arrays.asList("Dilligrout", "Baubles", "Caput Draconis", "Pig Snout",
          "Wattlebird", "Banana Fritters"));

      // ArrayList<String> changedOnce = new ArrayList<String> (Arrays.asList("Baubles",
      //     "Caput Draconis", "Pig Snout", "Wattlebird", "Banana Fritters", "Dilligrout"));
      // ArrayList<String> changedTwice = new ArrayList<String> (Arrays.asList("Caput Draconis",
      //     "Pig Snout", "Wattlebird", "Banana Fritters", "Dilligrout", "Baubles"));
      for(String i : inputList){
        System.out.println(i);
      }
    changePassword(inputList);
    changePassword(inputList);
    System.out.println("-------------------");
      for(String i : inputList){
        System.out.println(i);
      }
      

      //performing set operation in List
      List<Integer> list = Arrays.asList(12, 35, 67, 89, 9);
      updateMarks(list, 4, 98);
    }

    
}
