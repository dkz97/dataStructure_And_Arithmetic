package dkz97;

/**
 * 一个选择排序，和冒泡排序差不多，不过是先把最大的放在最后面
 */
public class SelectionSort {

    public static int[] selectionSort(int[] arrays){
        for (int i = arrays.length - 1; i >= 0;i--) {
            for (int j = 0; j < i;j++){
                if (arrays[j] > arrays[j+1]) {
                    swap(arrays,j,j+1);
                }
            }
        }
        return arrays;
    }

    /**
     * 数字交换的方法
     */
    public static void swap(int[] array,int i,int j){
        int num = array[i];
        array[i] = array[j];
        array[j] = num;
    }
}
