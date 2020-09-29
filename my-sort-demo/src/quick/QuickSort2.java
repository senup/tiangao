package quick;

/**
 * @Author: 涛哥
 * @Description:双边扫描+左值为轴点
 * @Date: Created in 2020/9/20  19:28
 * @Modified By:
 */
/**
随意抽取一个数作为基准值，然后从数组左右两边进行扫描，
先从左往右找到一个大于基准值的元素，将下标指针记录下来，
然后转到从右往左扫描，找到一个小于基准值的元素，交换这
两个元素的位置，重复步骤，直到左右两个指针相遇，再将基准
值与左侧最右边的元素交换。*/

public class QuickSort2 {
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
        sort(arr, low, pivot-1);
        sort(arr, pivot+1, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int left = low;//左指针 变化
        int right = high;//右指针 变化
        int pivot = arr[low];//第一个元素作为基准值

        while (true) {
            while (arr[left] <= pivot) {
                left++;
                if (left == high) {
                    break;
                }
            }
            while (arr[right] > pivot) {
                right--;
                if (right == low) {
                    break;
                }
            }

            if (left >= right) {
                break;
            }

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        int temp = arr[low];
        arr[low] = arr[right];
        arr[right] = temp;
        return right;
    }


}
