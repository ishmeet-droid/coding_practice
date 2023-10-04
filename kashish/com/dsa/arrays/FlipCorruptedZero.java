package kashish.com.dsa.arrays;

public class FlipCorruptedZero {
   public static int traffic(int n, int m, int []vehicle) {
          
              int ans = 0, count = 0, right = 0 ;
            // For loop to move the left pointer.
            for(int left = 0; left < n; left++)
            {
                // while right is less than n and count is <= m.
                while(right < n && count <= m)
                {
                    // If vehicle at right is 0.
                    if(vehicle[right] == 0)
                    {
                        count++ ;
                        // Break if count exceeds m.
                        if(count > m)
                        {
                            count-- ;
                            break ;
                        }
                    }
                    right++ ;
                }
                // Update answer.
                ans = Math.max(ans, right - left) ;
                // If vehicle at left is 0.
                if(vehicle[left] == 0)
                {
                    count-- ;
                }
            }
            // Return answer.
            return ans ;
            // for(int i = 0; i < n; i++){
            //     corruptedValue = m;
            //     int tempSum = 0;
            //     for(int j = i; j < n; j++){
            //         if(corruptedValue > 0 && vehicle[j] == 0){
    
            //             tempSum += 1;
            //             corruptedValue--;
                       
            //         }else if(vehicle[j] == 1){
            //             tempSum += vehicle[j];
            //         }
            //         else{
            //             break;
            //         }
                   
    
            //     }
            //     sum = Math.max(sum,tempSum);
            // }
            // return sum;
        }
}
