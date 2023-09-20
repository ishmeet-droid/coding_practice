package kashish.com.practice.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOperations {

     public static void findNthFavourite(List<String> authorList, int n) {
      
      authorList.remove(0);
      for(String i : authorList){
        System.out.println(i);
      }
    }
    public static void main(String args[]) {
        //UnModifidable list can remove elements in List.....

        // List<String> authorList = Arrays.asList("Chetan Bhagat", "Aravind Adiga", "Khushwant Singh",
        //     "Salman Rushdie", "Shyam Singha Roy");
             List<String> unModified = List.of("Chetan Bhagat", "Aravind Adiga", "Khushwant Singh",
            "Salman Rushdie", "Shyam Singha Roy");
        int n = 1;
    //    Throws Unsupported Array....-> unModified.add("cannot add me");
        List<String> authorList = new ArrayList<>(unModified);
        authorList.add("new Author");
        

        
    
      findNthFavourite(authorList, 1);//5
      System.out.println(authorList.size());//4
    }
    
}
