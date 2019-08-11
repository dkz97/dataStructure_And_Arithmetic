package dkz97.test;

import dkz97.BubbleSort;
import dkz97.InsertionSort;
import dkz97.MergeSort;
import dkz97.SelectionSort;
import org.junit.Test;

public class SortTest {


    /**
     * 测试冒泡排序
     */
    @Test
    public void testBubbleSort() {
        int[] array1 = {2,6,2,6,2,7,9,5,2,3,3,9,213,321,632,43,743};
        int[] array2 = {3,7,3,3,4,5,6,7,8,1,2,12,52,72,82,24,27};
        int[] array3 = {8,2,3,4,6,1,3,6,8,21,321,52,6,27};

        int[] result_arrays1 = BubbleSort.bubbleSort(array1);
        int[] result_arrays2 = BubbleSort.bubbleSort(array2);
        int[] result_arrays3 = BubbleSort.bubbleSort(array3);

        for(int i : result_arrays1) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + "----------------------------------");
        for(int i : result_arrays2) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + "----------------------------------");

        for(int i : result_arrays3) {
            System.out.print(i + " ");
        }
    }

    /**
     * 测试选择排序
     */
    @Test
    public void testSelectionSort() {
        int[] array1 = {2,6,2,6,2,7,9,5,2,3,3,9,213,321,632,43,743};
        int[] array2 = {3,7,3,3,4,5,6,7,8,1,2,12,52,72,82,24,27};
        int[] array3 = {8,2,3,4,6,1,3,6,8,21,321,52,6,27};

        int[] result_arrays1 = SelectionSort.selectionSort(array1);
        int[] result_arrays2 = SelectionSort.selectionSort(array2);
        int[] result_arrays3 = SelectionSort.selectionSort(array3);

        for(int i : result_arrays1) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + "----------------------------------");
        for(int i : result_arrays2) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + "----------------------------------");

        for(int i : result_arrays3) {
            System.out.print(i + " ");
        }
    }

    /**
     * 测试插入排序
     */
    @Test
    public void testInsertionSort() {
        int[] array1 = {2,6,2,6,2,7,9,5,2,3,3,9,213,321,632,43,743};
        int[] array2 = {3,7,3,3,4,5,6,7,8,1,2,12,52,72,82,24,27};
        int[] array3 = {8,2,3,4,6,1,3,6,8,21,321,52,6,27};

        int[] result_arrays1 = InsertionSort.insertionSort(array1);
        int[] result_arrays2 = InsertionSort.insertionSort(array2);
        int[] result_arrays3 = InsertionSort.insertionSort(array3);

        for(int i : result_arrays1) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + "----------------------------------");
        for(int i : result_arrays2) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + "----------------------------------");

        for(int i : result_arrays3) {
            System.out.print(i + " ");
        }
    }


    /**
     * 测试归并排序
     */
    @Test
    public void testMergeSort() {
        int[] array1 = {2,6,2,6,2,7,9,5,2,3,3,9,213,321,632,43,743};
        int[] array2 = {3,7,3,3,4,5,6,7,8,1,2,12,52,72,82,24,27};
        int[] array3 = {8,2,3,4,6,1,3,6,8,21,321,52,6,27};

        MergeSort.mergeSort(array1,0,array1.length-1);
        MergeSort.mergeSort(array2,0,array2.length-1);
        MergeSort.mergeSort(array3,0,array3.length-1);

        for(int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + "----------------------------------");
        for(int i : array2) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + "----------------------------------");

        for(int i : array3) {
            System.out.print(i + " ");
        }
    }
}
