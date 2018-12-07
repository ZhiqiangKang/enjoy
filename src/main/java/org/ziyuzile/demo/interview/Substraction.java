package org.ziyuzile.demo.interview;

public class Substraction {

    public static void main(String[] args) {
        int[] m = {1,2,3,4,5,6};
        int[] n = {4,5,6,7};

        int[] result = execute(m, n);
        for (int i : result){
            System.out.println(i);
        }
    }

    private static int[] execute(int[] m, int[] n){
        if(m == null || n == null){
            return null;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (i == j){

                }
            }
        }

        return null;
    }
}
