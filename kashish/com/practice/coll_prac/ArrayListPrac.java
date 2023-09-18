package kashish.com.practice.coll_prac;

import java.util.Arrays;

public class ArrayListPrac {
    
     public static void main(String[] args)
{
    Integer intArr[][] = { {10,5}, {20}, {30}, {40} };

    // To convert array to List
    // System.out.println("Integer Array as List: "
    //                     + Arrays.asList(intArr));
    // List<Integer> l = Arrays.asList(intArr);
    // for(Integer i : l){
    //     System.out.println(i);
    // }

    // // To print the elements in one line
    // System.out.println("Integer Array: "
    //                    + Arrays.toString(intArr));

    // // Sorting and searching an array
    // Arrays.sort(intArr);
    // int intKey = 22;
    // System.out.println(intKey + " found at index = "
    //                     + Arrays.binarySearch(intArr, intKey));

    Integer intArr1[][] = { {10, 5}, {20}, {30}, {40} };

    // Comparing two arrays
    System.out.println("Integer Arrays on comparison: "
                        + Arrays.deepEquals(intArr, intArr1));
   // System.out.println("Integer Arrays on comparison: "
   //                      + Arrays.compare(intArr, intArr1));
}
}
