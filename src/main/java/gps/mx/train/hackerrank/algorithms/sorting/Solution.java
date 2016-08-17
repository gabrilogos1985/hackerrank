package gps.mx.train.hackerrank.algorithms.sorting;

/**
 * Created by Gabe on 03/08/2016.
 */
public class Solution {

    public static void insertIntoSorted(int[] numbers) {
        int indexLeft = numbers.length - 1;
        int unsortNumber = numbers[indexLeft];
        int indexIteration = 2;
        sortwith(numbers, indexLeft, unsortNumber, indexIteration);
    }

    private static void sortwith(int[] numbers, int indexLeft, int unsortNumber, int indexIteration) {
        int numberToEvaluate = numbers[numbers.length - indexIteration];
        if(indexIteration>numbers.length)
            return;
        if (numberToEvaluate > unsortNumber) {
            numbers[indexLeft] = numberToEvaluate;
            printArray(numbers);
            sortwith(numbers, --indexLeft, unsortNumber,indexIteration+1);
        } else {
            numbers[indexLeft] = unsortNumber;
            printArray(numbers);
        }
    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
            System.err.print(n + " ");
        }
        System.out.println("");
        System.err.println("");
    }
}
