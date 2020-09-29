package shell;

/**
 * @Author: 涛哥
 * @Description:
 * @Date: Created in 2020/9/20  18:35
 * @Modified By:
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,6,1,3,9,5,4,1,10,100};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(int[] arr) {
        int h = 1;
        while (h < arr.length / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < arr.length; i++) {
                int cur = arr[i];
                int j = 0;
                for (j = i - h; j >= 0; j -= h) {
                    if (arr[j] > cur) {
                        arr[j+h] = arr[j];
                    }else{
                        break;
                    }
                }
                arr[j+h] = cur;
            }
            h = h/3;
        }

    }
}
