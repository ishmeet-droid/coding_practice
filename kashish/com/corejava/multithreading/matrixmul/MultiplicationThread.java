package kashish.com.corejava.multithreading.matrixmul;

public class MultiplicationThread implements Runnable{
    int[][] m1 ;
    int[][] m2 ;
    int[][] res ;

    int row;
    

    public MultiplicationThread(int[][] res,int[][] m1, int[][] m2, int row) {
        this.m1 = m1;
        this.m2 = m2;
        this.res = res;
        this.row = row;
    }

    /*

     1 2   5 6
     3 4   7 8

    for(int i = 0; i < row1; i++){
        for(int j = 0; j < col2; j++){

            for(int k = 0; k < col1; k++){
                res[i][j] += m1[i][k] + m2[k][j];
            }
        }
    }
    */


    @Override
    public void run() {
     for(int i = 0; i < m2[0].length ; i++){
            for(int j = 0; j < m2[0].length ; j++){
                res[row][i] += m1[row][j] * m2[j][i];
            }
     }
    }
    
}
