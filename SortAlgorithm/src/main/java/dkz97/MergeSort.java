package dkz97;

/**
 * 归并排序
 */
public class MergeSort {

    /**
     * 归并排序的主要函数
     */
    public static void mergeSort(int[] arrays,int left,int right) {
        // 归并排序，主要用到了分治法，将一个数组无限的左边拆分，右边拆分，拆分完之后，进行合并排序
        // 首先是要将数组分为左边和右边，然后递归下去，然后排序
        // 如果left = right，就说明只有一个数，这个时候就可以return了，然后就可以进行递归的出口了
        if (left == right) {
            return;
        }

        int mid = (left + right) / 2;

        mergeSort(arrays,left,mid); //左边的拆分
        mergeSort(arrays,mid + 1,right); // 右边的拆分
        // 拆分递归完后就进行数组的排序
        merge(arrays,left,mid,right);
    }

    /**
     * 进行一个合并排序，主要思想,创建一个虚拟数组，然后对两个合并数组进行外排序，然后放到虚拟数组中
     * 虚拟数组里面的数就把数据覆盖到原数组中
     */
    public static void merge(int[] arrays,int left,int mid,int right){

        // 首先创建虚拟数组，创建左数组的开头索引，右数组的开头索引
        int[] virtualArray = new int[right - left + 1];  // 创建虚拟数组
        int p1 = left;   // 创建外排左数组的索引
        int p2 = mid + 1; // 创建外排右边数组的索引
        int i = 0; //创建虚拟数组的索引

        // 进行无限循环，外排序,当索引越界的时候就会停止
        while(p1 <= mid && p2 <=right) {
            if (arrays[p1] < arrays[p2] ){
                // 左边数组的数少于右边数组的组
                virtualArray[i] = arrays[p1];
                i++;
                p1++;
            } else {
                //如果右边的数组比左边的数组小于或者等于，就加到虚拟数组中
                virtualArray[i] = arrays[p2];
                i++;
                p2++;
            }
        }

        // 再弄两个无限循环，就是防止某一个数组索引越界了，但是其他数组的索引还没越界，就把剩下的东西放进去虚拟数组中
        while (p1 <= mid) {
            virtualArray[i] = arrays[p1];
            i++;
            p1++;
        }
        while (p2 <= right) {
            virtualArray[i] = arrays[p2];
            i++;
            p2++;
        }

        // 然后把虚拟数组覆盖到原数组中
        for (int j = 0; j < virtualArray.length; j++){
            arrays[left + j] = virtualArray[j];
        }
    }



}
