package kashish.com.dsa.arrays;

public class LongestSubArrayWithSumK {

    public static int longestSubarrayLen(int []a, long reqSum) {
        // Write your code here
        int maxlen = 0;
        // int maxSum = 0;
        for(int i = 0; i < a.length; i++){

            for(int j = i; j < a.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){

                    sum += a[k];

                }
                if( sum == reqSum){

                    maxlen = Math.max(maxlen, j - i + 1);

                }
            }
        }
        return maxlen;
    }
    
}
