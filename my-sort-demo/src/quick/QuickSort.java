package quick;

/**
 * @Author: 涛哥
 * @Description:单边扫描+左值为轴点
 * @Date: Created in 2020/9/20  19:28
 * @Modified By:
 */

//随意抽取一个数作为基准值，同时设定一个标记 mark 代表左边序列最右侧的下标位置，
//当然初始为 0 ，接下来遍历数组，如果元素大于基准值，无操作，继续遍历，
//如果元素小于基准值，则把 mark + 1 ，再将 mark 所在位置的元素和遍历到
//的元素交换位置，mark 这个位置存储的是比基准值小的数据，当遍历结束后，
// 将基准值与 mark 所在元素交换位置即可。
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,6,1,3,9,5,4,1,10,100};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        //切分
        int pivot = partition(arr, low, high);
        sort(arr, low, pivot);
        sort(arr, pivot+1, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];//轴点不变
        int curIdx = low;//指针 会变 需要比较得到最大的值

        for (int i = low + 1; i <= high; i++) {
            if (arr[i] < pivot) {
                curIdx++;
                int temp = arr[curIdx];
                arr[curIdx] = arr[i];
                arr[i] = temp;
            }
        }
        //两个位置交换值
        arr[low] = arr[curIdx];
        arr[curIdx] = pivot;

        return curIdx;//返回索引位置
    }


}
