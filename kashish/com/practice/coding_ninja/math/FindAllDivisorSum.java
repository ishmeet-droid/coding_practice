package kashish.com.practice.coding_ninja.math;

public class FindAllDivisorSum {

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
