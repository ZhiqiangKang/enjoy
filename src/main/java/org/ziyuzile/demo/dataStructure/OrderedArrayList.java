package org.ziyuzile.demo.dataStructure;

public class OrderedArrayList {

    private int[] intAry;

    private int size;

    public OrderedArrayList(int length) {
        intAry = new int[length];
    }

    public int size(){
        return size;
    }

    // Binary Search O(logn)
    public int find(int value){
        int leftIndex = 0;
        int rightIndex = size - 1;
        int index;

        while (true){
            index = (leftIndex + rightIndex) / 2;
            if(intAry[index] == value){
                return index;
            } else if (leftIndex >= rightIndex){
                return -1;
            } else {
                if (intAry[index] > value){
                    rightIndex = index - 1;
                } else if (intAry[index] < value){
                    leftIndex = index + 1;
                }
            }
        }
    }

    // Linear Insert
    public int insert(int value){
        int j;
        for (j = 0; j < size; j++){
            if (intAry[j] > value){
                break;
            }
        }
        for (int k = size; k > j; k --){
            intAry[k] = intAry[k - 1];
        }

        intAry[j] = value;
        size ++;

        return j;
    }

    public boolean delete(int value){
        int i = find(value);

        if(i == -1){
            return false;
        } else {
            // 元素前移，并判断是否仍存在与value相等的值，从而决定是否继续删除
            do {
                for (int j = i; j < size; j++ ){
                    intAry[j] = intAry[j + 1];
                }

                size--;
            } while (intAry[i] == value);

            return true;
        }
    }

    public  void display(){
        for (int i = 0; i < size; i++) {
            System.out.print(intAry[i] + " ");
        }
        System.out.println();
    }
}
