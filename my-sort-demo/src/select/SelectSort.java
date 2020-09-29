package select;

import java.util.jar.JarEntry;

/**
 * @Author: 涛哥
 * @Description:思路是当前值和当前值+1后的所有数值进行比较
 * @Date: Created in 2020/9/20  17:36
 * @Modified By:
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,6,1,3,9,5,4,1,10,100};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minIdx=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
}
