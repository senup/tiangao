package heap;

import sun.security.util.Length;

/**
 * @Author: 涛哥
 * @Description:
 * @Date: Created in 2020/9/20  19:04
 * @Modified By:
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,6,1,3,9,5,4,1,10,100};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(int[] arr) {
        //构建堆
        int length = arr.length;
        Heapify(arr, length);
        for (int i = length - 1; i > 0; i--) {
            int maxTemp = arr[0];
            arr[0] = arr[i];
            arr[i] = maxTemp;
            length--;
            sink(arr,0,length);
        }
    }

    private static void Heapify(int[] arr, int length) {
        for (int i = length - 1; i >= 0; i--) {
            sink(arr, i, length);
        }
    }

    private static void sink(int[] arr, int index, int length) {
        int leftSon = index*2+1;
        int rightSon = index * 2+2;
        int curIndex = index;//当前调整的节点下标

        if (leftSon<length && arr[leftSon] > arr[curIndex]) {
            curIndex = leftSon;
        }
        if (rightSon<length && arr[rightSon] > arr[curIndex]) {
            curIndex = rightSon;
        }
        if (curIndex != index) {
            int temp = arr[index];
            arr[index] = arr[curIndex];
            arr[curIndex] = temp;
            sink(arr, curIndex, length);
        }

    }


}
