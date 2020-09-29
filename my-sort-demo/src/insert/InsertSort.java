package insert;

/**
 * @Author: 涛哥
 * @Description:
 * @Date: Created in 2020/9/20  18:17
 * @Modified By:
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,6,1,3,9,5,4,1,10,100};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int cur = arr[i];
            int j =0;//为了保存当前指向的指针 需要抽取出来
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > cur) {
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = cur;
        }
    }
}
