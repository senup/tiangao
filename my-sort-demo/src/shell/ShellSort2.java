package shell;

/**
 * @Author: 涛哥
 * @Description:
 * @Date: Created in 2020/9/20  18:35
 * @Modified By:
 */
public class ShellSort2 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,6,1,3,9,5,4,1,10,100};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(int[] arr) {
        int h=1;
        while (h < arr.length / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < arr.length; i++) {
                for (int j = i; j >= h && arr[j] < arr[j - h];j-=h) {
                    int temp = arr[j];
                    arr[j] = arr[j-h];
                    arr[j-h] = temp;
                }
            }
            h = h/3;
        }

    }
}
