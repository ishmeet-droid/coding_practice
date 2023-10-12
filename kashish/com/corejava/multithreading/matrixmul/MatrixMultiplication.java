package kashish.com.corejava.multithreading.matrixmul;

import java.util.ArrayList;
import java.util.List;

public class MatrixMultiplication {


    public static void main(String[] args){

        int[][] m1 = new int[9000][9000];
        int[][] m2 = new int[9000][9000];
        int[][] res = null;
        // m1[0][0] = 1;
        // m1[0][1] = 2;
        // m1[1][0] = 3;
        // m1[1][1] = 4;
        // m2[0][0] = 1;
        // m2[0][1] = 2;
        // m2[1][0] = 3;
        // m2[1][1] = 4;

        if(m1[0].length == m2.length){

            
           
            res = new int[m1.length][ m2[0].length];
            List<Thread> threads = new ArrayList<>();

            long  start = System.currentTimeMillis();

            for(int row = 0; row < m1.length; row++){

                MultiplicationThread mt = new MultiplicationThread(res,m1, m2, row);
                Thread thread = new Thread(mt);
                thread.start();  
                threads.add(thread);
            }


            
            for(Thread t : threads){
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            long  end = System.currentTimeMillis();
            System.out.println(end - start);

            // start = System.currentTimeMillis();
            // for(int i = 0; i < m1.length; i++){
            //     for(int j = 0; j < m2[0].length; j++){
        
            //         for(int k = 0; k < m2.length; k++){
            //             res[i][j] += m1[i][k] + m2[k][j];
            //         }
            //     }
            // }

            //  end = System.currentTimeMillis();
            // System.out.println(end - start);

        //     for(int i = 0; i < res.length ; i++){
        //         for(int j = 0; j < res.length ; j++){
        //             System.out.print(res[i][j] + " "); 
        //         }
        //         System.out.println("");
        //  }
            

        }


        
    }
    
}
