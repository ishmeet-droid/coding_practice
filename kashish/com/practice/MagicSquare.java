package kashish.com.practice;
import java.util.*;

public class MagicSquare {

    static boolean isMagicSquare(int[][] arr) {
      int rowSum, colSum, diagonalSum, antiSum;
         
      rowSum = colSum = diagonalSum = antiSum = 0;

       for(int i = 0; i < arr.length; i++){

          int tempRow, tempCol;  
          
          tempRow = tempCol = 0;

          for(int j = 0; j < arr.length; j++){

              tempCol+= arr[j][i];

              tempRow += arr[i][j];

              if(i == j){
                  diagonalSum += arr[i][j];
              }

              if((i + j) == (arr.length - 1)){
                  antiSum += arr[i][j];
              }
          }
          if(i == 0){
              rowSum = tempRow;
              colSum = tempCol;
          }else{
              if(tempRow != rowSum || tempCol != colSum){
                  return false;
              }
          }

       }

       if( (colSum == rowSum) && (antiSum == diagonalSum) && (colSum == antiSum))
          return true;

      return false;
      
     
    }

    public static void main(String args[]) {

        int[][] arr1 = {{4,9,2}, {3,5,7}, {8,1,6}};
        assert isMagicSquare(arr1) == true : "Expect true for arr = {{4,9,2}, {3,5,7}, {8,1,6}}";

        int[][] arr2 = {{4,9,2}, {3,5,9}, {8,1,6}};
        assert isMagicSquare(arr2) == false : "Expect false for arr = {{4,9,2}, {3,5,9}, {8,1,6}}";
        System.out.println("All test cases in main function passed");

    }
}

