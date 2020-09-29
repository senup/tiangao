package insert;

/**
 * @Author: 涛哥
 * @Description:
 * @Date: Created in 2020/9/20  18:48
 * @Modified By:
 */
public class insertSort2 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,6,1,3,9,5,4,1,10,100};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j-1]; j--) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
    }
}
