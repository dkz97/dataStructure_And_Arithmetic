package dkz97;

/**
 * 主要是根据棋盘问题引出的稀疏数组的最终代码实现
 * 主要流程就是  棋盘二维数组 -> 稀疏数组 -> 棋盘二维数组
 * 棋盘的黑子相当于 数组中的1. 白字相当于2. 无子就相当于0
 */
public class SparsArray {

    /**
     * 主要是传入一个二维数组，然后可以变成一维数组
     * @param two_array 传入的就是一个二维数组，相当于棋盘。
     * @return 返回一个根据稀疏算法压缩过后的稀疏数组
     */
    public static int[][] toSparsArray(int[][] two_array){
        /**
         * 参数传入的二维数组就相当于一个棋盘数组
         * 第一个增强循环可以把，一个数组拿出来
         * 第二个增强循环可以把当前的数字拿出来
         */

        int size = 0; // 计算当前共有多少个有效值
        for (int[] one_array : two_array) {
            for (int array : one_array) {
                if (array != 0) {
                    size ++;
                }
            }
        }

        // 创建稀疏数组
        int[][] sparsArray = new int[size + 1][3];
        sparsArray[0][0] = two_array.length;
        sparsArray[0][1] = two_array.length;
        sparsArray[0][2] = size;

        // 遍历棋盘，将值导入到其中
        int count = 1; //计算索引
        for (int i = 0;i < two_array.length;i++){
            for (int j = 0; j < two_array.length;j++){
                if (two_array[i][j] != 0) {
                    sparsArray[count][0] = i;
                    sparsArray[count][1] = j;
                    sparsArray[count][2] = two_array[i][j];
                    count++;
                }
            }
        }
        return sparsArray;

    }


    /**
     * 将稀疏数组重新变成回棋盘
     */
    public static int[][] toTwo_Array(int[][] sparsArray) {
        int[][] two_Array = new int[sparsArray[0][0]][sparsArray[0][1]];

        for (int i =1 ; i < sparsArray.length; i++){
            two_Array[sparsArray[i][0]][sparsArray[i][1]] = sparsArray[i][2];
        }
        return two_Array;

    }
}
