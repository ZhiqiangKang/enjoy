package org.ziyuzile.demo.dataStructure;

public class Sort {

    public static void main(String[] args) {
        int[] intAry = {4,532,32,6,2,9,5,32,64,23,};
        bubbleSort(intAry);
//        selectionSort(intAry);
        print(intAry);
    }

    /**
     * 冒泡排序 O(n2)
     * @param intAry
     */
    private static void bubbleSort(int[] intAry){
        int out, in;

        for (out = intAry.length - 1; out > 1; out--){
            for (in = 0; in < out; in++){
                if (intAry[in] > intAry[in + 1]){
                    swap(intAry, in, in + 1);
                }
            }
        }
    }

    /**
     * 选择排序 O(n2)
     * @param intAry
     */
    private static void selectionSort(int[] intAry){
        for (int i = 0; i < intAry.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < intAry.length; j++) {
                if(intAry[j] < intAry[min]){
                    min = j;
                }
            }
            swap(intAry, min, i);
        }
    }

    /**
     * 交换数组两个位置上的值
     * @param intAry
     * @param index1
     * @param index2
     */
    private static void swap(int[] intAry, int index1, int index2){
        int tmp = intAry[index2];
        intAry[index2] = intAry[index1];
        intAry[index1] = tmp;

    }

    private static void print(int[] intAry){
        for (int i : intAry) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
