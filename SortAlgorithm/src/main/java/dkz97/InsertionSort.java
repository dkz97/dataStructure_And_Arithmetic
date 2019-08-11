package dkz97;

/**
 * 插入排序，原理主要和玩牌纸差不多，就拿一个数，从后往前插入。
 */
public class InsertionSort {

    /**
     * 插入排序
     */
    public static int[] insertionSort(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = i - 1; j >= 0;j--){
                if (arrays[j] <= arrays[j + 1]){
                    break;
                } else {
                    swap(arrays,j,j+1);
                }
            }
        }
        return arrays;
    }

    /**
     * 数字交换的方法
     */
    public static void swap(int[] array,int i, int j){
        int num = array[i];
        array[i] = array[j];
        array[j] = num;
    }
}
