package dkz97;

/**
 * 一个关于冒泡排序方法
 * 冒泡排序先把最小的放在前面，慢慢排到最后，时间复杂度为O(n^2)
 */
public class BubbleSort {

    /**
     * 冒泡排序方法
     */
    public static int[] bubbleSort(int[] arrays){

        for(int i = 0; i < arrays.length; i++) {
            for(int j = arrays.length - 1; j > i; j--){
                if(arrays[j] < arrays[j-1]){
                    swap(arrays,j,j-1);
                }
            }
        }
        return arrays;
    }

    /**
     * 一个把数字两两兑换的方法
     */
    public static void swap(int[] array,int i,int j) {
        int num = array[i];
        array[i] = array[j];
        array[j] = num;
    }
}
