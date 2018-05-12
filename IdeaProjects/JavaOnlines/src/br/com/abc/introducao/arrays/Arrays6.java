package br.com.abc.introducao;

public class Arrays6 {
    public static void main(String[] args) {

       int[] array = new int[3];
       int[] arrays = {1,2};
       int[] aInts = new int[]{2,1};

/*       int[][] dias = new int[3][];
       dias[0] = new int[2];
       dias[1] = new int[]{1,2,3};
       dias[2] = new int[4];*/

        int[][] dias = {{0,0},{1,2,3},{0,0,0,0}};
       for(int[] a :dias){
           for(int b:a)
               System.out.println(b);
       }
    }

}
