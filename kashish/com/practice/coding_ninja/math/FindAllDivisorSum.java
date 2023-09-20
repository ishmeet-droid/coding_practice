package kashish.com.practice.coding_ninja.math;

public class FindAllDivisorSum {
  // Code Link --> https://www.codingninjas.com/studio/problems/sum-of-all-divisors_8360720?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=2
    public static int sumOfAllDivisors(int n){
        // Write your code here.


        int sum = 0;	
	for(int i = 1; i <= n; i++){
        
		for(int j = 1; j <= Math.sqrt(i); j++ ){
			if(i % j == 0){
			if(i / j == j){
                sum += j;
            }
            else{
                sum += j + i/j;
            }
			}
		}
    
	}
	return sum;
    }

    public static void main(String[] args){
            System.out.println(sumOfAllDivisors(10));
    }
    
}
