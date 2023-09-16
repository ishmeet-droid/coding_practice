package kashish.com.practice.arrays;

public class PowerOfTwo {

    static int findLargestPowerOfTwo(int n) {

        if(n == 0){
            return 0;
        }
  
        int i;
        for(i=0;Math.pow(2,i) <= n;i++);
        return i-1; 
      }
  
      public static void main(String args[]) {
  
          assert findLargestPowerOfTwo(9) == 3 : "Expect 3 for n = 9";
  
          assert findLargestPowerOfTwo(32) == 5 : "Expect 5 for n = 32";
          System.out.println("All test cases in main function passed");
  
      }
    
}
