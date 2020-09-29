package bubble;

/**
 * @Author: 涛哥
 * @Description:
 * @Date: Created in 2020/9/20  17:09
 * @Modified By:
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,6,1,3,9,5,4,1,10,100};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(int[] arr) {
        //升序的冒泡：交换
        //外层循环负责最后一个赋值 内层循环负责交换
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
