package org.ziyuzile.demo.interview;

public class BalancePoint {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,2,1};

        System.out.println(getBalancePoint(numbers));
        System.out.println(getBalancePoint1(numbers));
        System.out.println(getBalancePoint2(numbers));
    }

    private static int getBalancePoint(int[] numbers){
        if(numbers == null || numbers.length <= 2){
            return -1;
        }

        return -1;
    }

    private static int getBalancePoint1(int[] numbers){
        if(numbers == null || numbers.length <= 2){
            return -1;
        }

        int sum = 0;
        int subSum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        for (int i = 1; i < numbers.length; i++) {
            if(subSum == sum - subSum - numbers[i]){
                return i;
            } else {
                subSum += numbers[i];
            }
        }

        return -1;
    }

    private static int getBalancePoint2(int[] numbers){
        if(numbers == null || numbers.length <= 2){
            return -1;
        }

        int leftSum = 0;

        for (int i = 1; i < numbers.length; i++) {
            leftSum += numbers[i - 1];

            int rightSum = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                rightSum += numbers[j];
            }

            if (leftSum == rightSum){
                return i;
            } else {
                continue;
            }
        }

        return -1;
    }
}
