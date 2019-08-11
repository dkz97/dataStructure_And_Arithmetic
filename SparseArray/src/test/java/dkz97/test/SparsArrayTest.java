package dkz97.test;


import dkz97.SparsArray;
import org.junit.Test;

public class SparsArrayTest {

    @Test
    public void testSparsArray() {
        int[][] two_arrays = new int[11][11];
        // 创建一个棋盘，并且赋予值
        two_arrays[2][3] = 2;
        two_arrays[3][1] = 1;
        two_arrays[5][1] = 2;
        for (int i = 0;i < two_arrays.length;i++){
            for (int j = 0; j < two_arrays.length;j++){
                System.out.print(two_arrays[i][j] + " ");
            }
            System.out.println("\n");
        }

        System.out.println("----------------------");
        // 测试棋盘能否变成稀疏数组
        int[][] sparsArray = SparsArray.toSparsArray(two_arrays);
        for (int i = 0;i < sparsArray.length;i++){
            for (int j = 0; j < 3;j++){
                System.out.print(sparsArray[i][j] + " ");
            }
            System.out.println("\n");
        }

        System.out.println("----------------------");
        // 测试稀疏数组能否变回棋盘
        int[][] two_array = SparsArray.toTwo_Array(sparsArray);
        for (int i = 0;i < two_array.length;i++){
            for (int j = 0; j < two_array.length;j++){
                System.out.print(two_array[i][j] + " ");
            }
            System.out.println("\n");
        }

    }

}
